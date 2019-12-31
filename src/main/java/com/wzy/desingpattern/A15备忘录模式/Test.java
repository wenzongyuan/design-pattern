package com.wzy.desingpattern.A15备忘录模式;

import com.sun.deploy.net.HttpResponse;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Test {

//    public static void main(String[] args) {
//        //创建需要备份的资源
//        Originator originator = new Originator("1");
//
//        //创建备份并将备份交给备份的看守人
//        CareTaker careTaker = new CareTaker(originator.createMemento());
//
//        //开始处理事情，改变状态
//        originator.setState("2");
//
//        //处理事情失败了，从备份看守人获取到备份的数据去重置状态
//        originator.restoreByMemento(careTaker.getMemento());
//
//        System.out.println(originator.getState());
//
//    }
    public static String httpClientUploadFile(String url, File file) {
    CloseableHttpClient httpClient = HttpClients.createDefault();
    String result = "";
    //每个post参数之间的分隔。随意设定，只要不会和其他的字符串重复即可。
    String boundary ="--------------4585696313564699";
    try {
        //文件名
        String fileName = file.getName();
        HttpPost httpPost = new HttpPost(url);
        //设置请求头
        httpPost.setHeader("Content-Type","multipart/form-data; boundary="+boundary);

        //HttpEntity builder
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        //字符编码
        builder.setCharset(Charset.forName("UTF-8"));
        //模拟浏览器
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        //boundary
        builder.setBoundary(boundary);
        //multipart/form-data
        builder.addPart("file",new FileBody(file));
        //其他参数
        builder.addTextBody("parent_dir", "/xxx/",  ContentType.create("text/plain", Consts.UTF_8));
        //HttpEntity
        HttpEntity entity = builder.build();
        httpPost.setEntity(entity);
        // 执行提交
        CloseableHttpResponse response = httpClient.execute(httpPost);

        response.getStatusLine().getStatusCode();

        System.out.println(response.getStatusLine().getStatusCode());
        //响应
        HttpEntity responseEntity = response.getEntity();

        if (responseEntity != null) {
            // 将响应内容转换为字符串
            result = EntityUtils.toString(responseEntity, Charset.forName("UTF-8"));
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
                System.err.println("result"+result);
                return result;
}

    //main 方法
    public static void main(String[] args) {
        httpClientUploadFile("http://192.168.174.134/seafhttp/upload-api/26fe1fff-cd08-40e0-b452-27e2933f554d",new File("D:\\JDBC.java"));
    }
}

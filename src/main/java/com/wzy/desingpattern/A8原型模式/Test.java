package com.wzy.desingpattern.A8原型模式;

import com.wzy.desingpattern.A8原型模式.Object.MailTest;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception{

        List <String> checkProject = new ArrayList <String>();
        checkProject.add("血糖");
        MailTest mailTest = new MailTest("127.0.0.1", "体检通知", "明天早上体检，请你早点到公司！", checkProject);

        for (int i = 1; i < 10; i++) {
            System.out.println(mailTest);
            mailTest.setIp("127.0.0."  + (i+1));
        }

        System.out.println("======================================");
        for (int i = 1; i < 10; i++) {
            System.out.println(mailTest);
            //使用原型模式，通过克隆获取另外一个对象，如果只是浅拷贝的话，
            // 成员变量的引用类型都会指向一篇内存地址，一改则改所有。
            MailTest mailTest1 = mailTest.clone();
            mailTest1.setIp("127.0.0."  + (i+1));
            mailTest1.addCheckProject("耳鼻喉");
        }

    }
}

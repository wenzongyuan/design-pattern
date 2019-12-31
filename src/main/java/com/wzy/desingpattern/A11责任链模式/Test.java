package com.wzy.desingpattern.A11责任链模式;

/**
 * 一个请求（如银行客户存款的币种），一个处理者（只处理人 民币），
 * 但是随着业务的发展（改革开放了嘛，还要处理美元、日元等），
 * 处理者的数量和类型都有所增加， 那这时候就可以在第一个处理者后面建立一个链，
 * 也就是责任链来处理请求，如果是人民币，好，
 * 还是第一个 业务逻辑来处理；如果是美元，好，
 * 传递到第二个业务逻辑来处理；
 * 日元、欧元……这些都不用在对原有的业 务逻辑产生很大改变，
 * 通过扩展实现类就可以很好地解决这些需求变更的问题
 */
public class Test {
    public static void main(String[] args) {
        //获取责任链的第一个 处理器
        AbstractHandler handler = HandlerContext.getHandler();

        CustomerBusiness c1 = new CustomerBusiness("张三","RMB");
        CustomerBusiness c2 = new CustomerBusiness("李四","USA");
        CustomerBusiness c3 = new CustomerBusiness("王二","HB");

        handler.handlerBusiness(c1);
        handler.handlerBusiness(c2);
        handler.handlerBusiness(c3);
    }
}

package com.wzy.desingpattern.A11责任链模式.impl;

import com.wzy.desingpattern.A11责任链模式.AbstractHandler;
import com.wzy.desingpattern.A11责任链模式.CustomerBusiness;

/**
 * 专门负责处理人名币的处理器
 */
public class RMBHandler extends AbstractHandler {
    @Override
    protected boolean isMyHandlerResponsibility(String currency) {

        boolean handler = false;
        if ("RMB".equals(currency)){
            handler = true;
        }
        return handler;
    }

    @Override
    protected void doHandler(CustomerBusiness customerBusiness) {
        System.out.println("正在处理 "+ customerBusiness.getName()+ " 存入 " + customerBusiness.getCurrency());
    }
}

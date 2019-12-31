package com.wzy.desingpattern.A11责任链模式.impl;

import com.wzy.desingpattern.A11责任链模式.AbstractHandler;
import com.wzy.desingpattern.A11责任链模式.CustomerBusiness;

/**
 * 专门负责处理美元的处理器
 */
public class DollarHandler extends AbstractHandler {

    @Override
    protected boolean isMyHandlerResponsibility(String currency) {

        boolean handler = false;
        if ("USA".equals(currency)){
            handler = true;
        }
        return handler;
    }

    @Override
    protected void doHandler(CustomerBusiness customerBusiness) {
        System.out.println("正在处理 "+ customerBusiness.getName()+ " 存入 " + customerBusiness.getCurrency());
    }
}

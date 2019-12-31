package com.wzy.desingpattern.A6proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerHandler implements InvocationHandler {

    private Object object;

    public GamePlayerHandler(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object ores =  method.invoke(object,args);
        after();
        return ores;
    }

    private void before(){
        System.out.println("before.....");
    }

    private void after(){
        System.out.println("after....");
    }
}

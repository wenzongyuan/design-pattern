package com.wzy.desingpattern.A6proxy.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class CglibDynamicProxy<T> {

    public static  <T> T createProxy(MethodInterceptor methodInterceptor, Class<T> clazz){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(methodInterceptor);

        return (T) enhancer.create();
    }
}

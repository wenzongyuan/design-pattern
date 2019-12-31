package com.wzy.desingpattern.A6proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy<T> {

    public static  <T> T createProxy(InvocationHandler handler, ClassLoader classLoader, Class <?>[] interfaces){

        return (T)Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}

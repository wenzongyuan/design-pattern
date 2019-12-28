package com.wzy.desingpattern.A6proxy.cglibDynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerInterceptor implements MethodInterceptor {

    private Object object;

    public GamePlayerInterceptor(Object object) {
        this.object = object;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object o1 = methodProxy.invoke(this.object, objects);
        after();
        return o1;
    }


    private void before(){
        System.out.println("cglib before.....");
    }

    private void after(){
        System.out.println("cglib after....");
    }
}

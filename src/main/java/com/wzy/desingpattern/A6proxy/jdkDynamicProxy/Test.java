package com.wzy.desingpattern.A6proxy.jdkDynamicProxy;

import com.wzy.desingpattern.A6proxy.jdkDynamicProxy.impl.GamePlayer;
import java.lang.reflect.InvocationHandler;
/**
 * 1、静态代理类: 由程序员创建或由特定工具自动生成源代码,再对其编译。
 *                在程序运行前,代理类的.class文件就已经存在了。
 * 2、动态代理类:动态代理类的字节码在程序运行时由Java反射机制动态生成,无需程序员手工编写它的源代码。
 *
 * 为啥jdk 动态代理的目标类必须要实现一个接口？由于jdk 动态代理生成的代理类会extends Proxy(java 反射包定义的类) ，
 * 但是又需要跟目标类同样的函数，那就只能跟目标类实现同一个接口，因此就强制了目标类必须要实现一个接
  3、 jdk动态代理利用拦截器(拦截器必须实现InvocationHanlder)加上反射机制生成一个实现代理接口的匿名类，
      在调用具体方法前调用InvocationHanlder来处理。
  4、cglib利用ASM开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处理。
    4.1）JDK动态代理只能对实现了接口的类生成代理，而不能针对类。
    4.2）CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法，
      并覆盖其中方法实现增强，但是因为采用的是继承，所以该类或方法最好不要声明成final，
      对于final类或方法，是无法继承的。
 */
public class Test {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer();
        InvocationHandler invocationHandler  = new GamePlayerHandler(gamePlayer);
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        Class <?>[] interfaces = gamePlayer.getClass().getInterfaces();

        IGamePlayer proxy = JdkDynamicProxy.createProxy(invocationHandler, classLoader, interfaces);
        proxy.playGanme();
        /*
        before.....
        play game .....
        after....
         */
        //测试jdk的动态 代理类还能不能被代理
        InvocationHandler invocationHandler1  = new GamePlayerHandler(proxy);
        IGamePlayer proxy1 = JdkDynamicProxy.createProxy(invocationHandler1, classLoader, interfaces);
        proxy1.playGanme();
        /*
        before.....
        before.....
        play game .....
        after....
        after....
         */
        //从输出结果来看，jdk的动态代理生成的类依旧是可以被代理的。
    }
}

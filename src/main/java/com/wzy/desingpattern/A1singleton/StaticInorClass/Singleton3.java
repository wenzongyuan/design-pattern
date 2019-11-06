package com.wzy.desingpattern.A1singleton.StaticInorClass;

/**
 * 静态内部类单例模式：使用了java中静态内部采用懒加载的形式，只有用到的时候才会加载，来达到延时的功能。并且加载静态内部类是线程安全的
 * 特点：线程安全、效率高，能延时。
 *
 */
public class Singleton3 {

    private static class SingletonStaticClass{

        private static final Singleton3 instance = new Singleton3();
    }

    private Singleton3(){

    }

    public static Singleton3 getInstance(){

        return SingletonStaticClass.instance;
    }
}

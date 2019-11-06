package com.wzy.desingpattern.A1singleton.LazyMan;

/**
 * 双检查懒汉式
 * 特点：线程安全、效率相对较低、可延时
 */
public class Singleton2 {

    private volatile static Singleton2 instance = null; //线程会获取最新的数据。

    private Singleton2(){

    }

    //双检查懒汉式单例
    public static Singleton2 getInstance(){
        if (instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}

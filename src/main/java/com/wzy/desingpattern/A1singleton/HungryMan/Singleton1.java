package com.wzy.desingpattern.A1singleton.HungryMan;

/**
 * 饿汉式单例模式
 * 特点：效率高、线程安全、但是无延时。
 */
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return instance;
    }

}

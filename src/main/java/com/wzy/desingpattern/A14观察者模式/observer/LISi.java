package com.wzy.desingpattern.A14观察者模式.observer;

import java.util.Observable;
import java.util.Observer;

public class LISi implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("监控者李收到消息："  + arg);
    }
}

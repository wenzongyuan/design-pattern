package com.wzy.desingpattern.A9中介者模式.impl;

import com.wzy.desingpattern.A9中介者模式.AbstractColleague;

public class Colleague1 extends AbstractColleague {

    @Override
    public void colleaguedDo1() {
        System.out.println("      Colleague1....colleaguedDo1()");
    }

    @Override
    public void colleaguedDo2() {
        System.out.println("      Colleague1....colleaguedDo2()");
    }

    /**
    如果也有那种组装的业务的话，直接调用中介者
     */
    public void doSomething3(){
        System.out.println("beging........doSomething3........");
        this.mediator.doSomething1();
        System.out.println("end........doSomething3........");
    }
}

package com.wzy.desingpattern.A9中介者模式.impl;

import com.wzy.desingpattern.A9中介者模式.AbstractColleague;
import com.wzy.desingpattern.A9中介者模式.AbstractMediator;

public class MyMediator extends AbstractMediator {

    public MyMediator(AbstractColleague colleague1, AbstractColleague colleague2) {
        super(colleague1, colleague2);
    }

    @Override
    public void doSomething1() {

        System.out.println("MyMediator..begin......doSomething1......");
        super.colleague1.colleaguedDo2();
        super.colleague2.colleaguedDo1();
        System.out.println("MyMediator..end......doSomething1......");
    }

    @Override
    public void doSomething2() {
        System.out.println("MyMediator..begin......doSomething2......");
        super.colleague1.colleaguedDo2();
        super.colleague2.colleaguedDo1();
        System.out.println("MyMediator..end......doSomething3......");
    }
}

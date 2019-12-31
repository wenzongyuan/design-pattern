package com.wzy.desingpattern.A9中介者模式;

import com.wzy.desingpattern.A9中介者模式.impl.Colleague1;
import com.wzy.desingpattern.A9中介者模式.impl.Colleague2;
import com.wzy.desingpattern.A9中介者模式.impl.MyMediator;

/**
 * 中介者模式测试
 */
public class Test {

    public static void main(String[] args) {

        AbstractColleague colleague1 = new Colleague1();
        AbstractColleague colleague2 = new Colleague2();

        AbstractMediator mediator = new MyMediator(colleague1,colleague2);
        System.out.println("=======================mediator.doSomething1()================================");
        mediator.doSomething1();

        System.out.println("=======================mediator.doSomething2()================================");
        mediator.doSomething2();

        System.out.println("=======================colleague1.doSomething3()================================");
        ((Colleague1) colleague1).doSomething3();

        System.out.println("=======================colleague2.doSomething4()================================");
        ((Colleague2) colleague2).doSomething4();
    }
}

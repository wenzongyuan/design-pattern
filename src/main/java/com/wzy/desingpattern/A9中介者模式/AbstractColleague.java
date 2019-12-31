package com.wzy.desingpattern.A9中介者模式;

/**
 * 同事类抽象
 */
public abstract class AbstractColleague {

    //同事类必须知道跟自己对接的中介者
    protected AbstractMediator mediator;

    public abstract void colleaguedDo1();

    public abstract void colleaguedDo2();

    public AbstractMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}

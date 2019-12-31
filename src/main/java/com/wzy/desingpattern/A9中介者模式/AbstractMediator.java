package com.wzy.desingpattern.A9中介者模式;

/**
 * 中介者抽象
 */
public abstract class AbstractMediator {
    protected AbstractColleague colleague1;
    protected AbstractColleague colleague2;
    public AbstractMediator(AbstractColleague colleague1, AbstractColleague colleague2){
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
        //设置同事实例的 中介者
        this.colleague1.setMediator(this);
        this.colleague2.setMediator(this);
    }
    /*** 中介者的业务逻辑1(其实就是业务组装，利用colleague1、colleague2组装业务)*/
    public abstract void doSomething1();

    /*** 中介者的业务逻辑2(其实就是业务组装，利用colleague1、colleague2组装业务)*/
    public abstract void doSomething2();
    public AbstractColleague getColleague1() {
        return colleague1;
    }
    public void setColleague1(AbstractColleague colleague1) {
        this.colleague1 = colleague1;
    }
    public AbstractColleague getColleague2() {
        return colleague2;
    }
    public void setColleague2(AbstractColleague colleague2) {
        this.colleague2 = colleague2;
    }
}

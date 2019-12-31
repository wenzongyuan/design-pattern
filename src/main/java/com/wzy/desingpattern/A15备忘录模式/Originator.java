package com.wzy.desingpattern.A15备忘录模式;

/**
 * 需要备忘的资源
 */
public class Originator {
    //用状态测试，具体需要备份什么有自己业务决定
    private String state;

    public Originator(String state){
        this.state = state;
    }
    //创建一个备忘录
    public Memento createMemento(){
        return new Memento(this.state);
    }
    //通过之前创建的备忘录重置
    public void  restoreByMemento(Memento memento){
        this.state = memento.getState();
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}

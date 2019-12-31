package com.wzy.desingpattern.A13策略模式;

/**
 * 策略容器，装策略的地方
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

   public void invokerStategy(int a, int b){
        this.strategy.execute(a, b);
    }
}

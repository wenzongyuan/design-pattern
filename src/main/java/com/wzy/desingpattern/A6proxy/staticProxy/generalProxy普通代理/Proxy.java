package com.wzy.desingpattern.A6proxy.staticProxy.generalProxy普通代理;

public class Proxy implements IGamePlayer {

    private IGamePlayer target;

    public Proxy(IGamePlayer target){
        this.target = target;
    }

    public void playGanme() {

        before();

        this.target.playGanme();

        after();

    }

    private void before(){
        System.out.println("before....");
    }

    private void after(){
        System.out.println("after.....");
    }
}

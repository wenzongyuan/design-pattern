package com.wzy.desingpattern.A6proxy.staticProxy.forceProxy强制代理;

public class Proxy implements IGamePlayer {

    private IGamePlayer target;

    public Proxy(IGamePlayer target){
        this.target = target;
    }

    public void playGanme() {

        this.target.playGanme();
    }

    public IGamePlayer getProxy() {
        return this;
    }
}

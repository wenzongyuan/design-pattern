package com.wzy.desingpattern.A6proxy.staticProxy.forceProxy强制代理.impl;

import com.wzy.desingpattern.A6proxy.staticProxy.forceProxy强制代理.IGamePlayer;
import com.wzy.desingpattern.A6proxy.staticProxy.forceProxy强制代理.Proxy;

public class LOLGamePlayer implements IGamePlayer {

    private IGamePlayer proxy = null;

    public void playGanme() {

        if (this.isProxy()){
            System.out.println("I play LOL....");
        }else {
            System.out.println("请使用自己的代理来访问。。。。。。。");
        }

    }

    public IGamePlayer getProxy() {

        this.proxy = new Proxy(this);
        return this.proxy;
    }

    private boolean isProxy(){

        if (this.proxy ==null){
            return false;
        }

        return true;
    }
}

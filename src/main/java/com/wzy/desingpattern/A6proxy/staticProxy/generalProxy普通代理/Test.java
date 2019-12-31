package com.wzy.desingpattern.A6proxy.staticProxy.generalProxy普通代理;

import com.wzy.desingpattern.A6proxy.staticProxy.generalProxy普通代理.impl.DNFGamePlayer;
import com.wzy.desingpattern.A6proxy.staticProxy.generalProxy普通代理.impl.LOLGamePlayer;

public class Test {

    public static void main(String[] args) {
        IGamePlayer LOLGamePlayer = new LOLGamePlayer();
        IGamePlayer DNFGamePlayer = new DNFGamePlayer();

        IGamePlayer LOLProxy = new Proxy(LOLGamePlayer);
        LOLProxy.playGanme();

        System.out.println("-------------DNF BEGIN ---------------------");

        IGamePlayer DNFProxy = new Proxy(DNFGamePlayer);
        DNFProxy.playGanme();
    }
}

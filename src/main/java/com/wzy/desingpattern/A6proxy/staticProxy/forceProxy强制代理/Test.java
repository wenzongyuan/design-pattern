package com.wzy.desingpattern.A6proxy.staticProxy.forceProxy强制代理;

import com.wzy.desingpattern.A6proxy.staticProxy.forceProxy强制代理.impl.LOLGamePlayer;

/**
 * 强制代理就是必须使用代理才能调用，就算你使用目标类也不行。
 */
public class Test {

    public static void main(String[] args) {


        IGamePlayer gamePlayer = new LOLGamePlayer();
        gamePlayer.playGanme();//请使用自己的代理来访问。。。。。。。

        //================================================
        IGamePlayer gamePlayer1 = new LOLGamePlayer();
        IGamePlayer proxy = new Proxy(gamePlayer1);
        proxy.playGanme();//请使用自己的代理来访问。。。。。。。

        //===================OK=============================
        gamePlayer.getProxy().playGanme();//I play LOL....
    }
}

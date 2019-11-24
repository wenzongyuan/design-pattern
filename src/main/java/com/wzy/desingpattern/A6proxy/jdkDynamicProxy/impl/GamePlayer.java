package com.wzy.desingpattern.A6proxy.jdkDynamicProxy.impl;

import com.wzy.desingpattern.A6proxy.jdkDynamicProxy.IGamePlayer;

public class GamePlayer implements IGamePlayer {
    public void playGanme() {
        System.out.println("play game .....");
    }
}

package com.wzy.desingpattern.A18状态模式.impl;

import com.wzy.desingpattern.A18状态模式.AbstractLiftState;
import com.wzy.desingpattern.A18状态模式.Context;

public class RunState extends AbstractLiftState {

    @Override
    public void openDoor() {
        System.out.println("运行下不能开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("运行状态下门就是关闭的");
    }

    @Override
    public void run() {
        System.out.println("电梯开始运行。。。。");
    }

    @Override
    public void stop() {
        System.out.println("运行状态下可以停止电梯，委托停止状态");
        super.getContext().setState(Context.stopstate);
        super.getContext().stop();
    }
}

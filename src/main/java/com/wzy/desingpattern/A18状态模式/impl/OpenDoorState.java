package com.wzy.desingpattern.A18状态模式.impl;

import com.wzy.desingpattern.A18状态模式.AbstractLiftState;
import com.wzy.desingpattern.A18状态模式.Context;

public class OpenDoorState extends AbstractLiftState {

    @Override
    public void openDoor() {
            System.out.println("电梯开启。。。");
    }

    @Override
    public void closeDoor() {
        System.out.println("打开状态下可以关闭，委托关闭状态");
        super.getContext().setState(Context.closeDoorState);
        super.getContext().closeDoor();
    }

    @Override
    public void run() {
        System.out.println("打开状态下不能运行");
    }

    @Override
    public void stop() {
        System.out.println("开门的状态下本来就是停止的");
    }
}

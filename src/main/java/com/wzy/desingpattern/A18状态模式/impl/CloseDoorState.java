package com.wzy.desingpattern.A18状态模式.impl;

import com.wzy.desingpattern.A18状态模式.AbstractLiftState;
import com.wzy.desingpattern.A18状态模式.Context;

public class CloseDoorState extends AbstractLiftState {
    @Override
    public void openDoor() {
        System.out.println("关闭状态下可以打开，委托打开状态");
        super.getContext().setState(Context.openDoorState);
        super.getContext().openDoor();
    }

    @Override
    public void closeDoor() {

            System.out.println("电梯关门。。。");
    }

    @Override
    public void run() {
        System.out.println("关闭状态下可以打开，委托运行状态");
        super.getContext().setState(Context.runstate);
        super.getContext().run();
    }

    @Override
    public void stop() {
        System.out.println("关门状态下本来就是停止的");
    }
}

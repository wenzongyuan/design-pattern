package com.wzy.desingpattern.A18状态模式.impl;

import com.wzy.desingpattern.A18状态模式.AbstractLiftState;
import com.wzy.desingpattern.A18状态模式.Context;

public class StopState extends AbstractLiftState {

    @Override
    public void openDoor() {
        System.out.println("停止状态下可以打开，委托打开状态");
        super.getContext().setState(Context.openDoorState);
        super.getContext().openDoor();
    }

    @Override
    public void closeDoor() {
        System.out.println("停止状态下可以关闭，委托关闭状态");
        super.getContext().setState(Context.closeDoorState);
        super.getContext().closeDoor();
    }

    @Override
    public void run() {
        System.out.println("停止状态下可以运行，委托运行状态");
        super.getContext().setState(Context.runstate);
        super.getContext().run();
    }

    @Override
    public void stop() {
        System.out.println("停止电梯。。。");
    }
}

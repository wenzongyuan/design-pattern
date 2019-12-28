package com.wzy.desingpattern.A18状态模式;

import com.wzy.desingpattern.A18状态模式.impl.CloseDoorState;
import com.wzy.desingpattern.A18状态模式.impl.OpenDoorState;
import com.wzy.desingpattern.A18状态模式.impl.RunState;
import com.wzy.desingpattern.A18状态模式.impl.StopState;

/**
 * 电梯状态环境
 */
public class Context {

    public static final AbstractLiftState stopstate = new StopState();
    public static final AbstractLiftState runstate = new RunState();
    public static final AbstractLiftState closeDoorState = new CloseDoorState();
    public static final AbstractLiftState openDoorState = new OpenDoorState();

    private AbstractLiftState state;

    public AbstractLiftState getState() {
        return state;
    }

    public void setState(AbstractLiftState state) {
        this.state = state;
        //让状态类知道环境类
        this.state.setContext(this);
    }

    public Context(AbstractLiftState state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void openDoor(){
        this.state.openDoor();
    }

    public void closeDoor(){
        this.state.closeDoor();
    }

    public void run(){
        this.state.run();
    }

    public void stop(){
        this.state.stop();
    }
}

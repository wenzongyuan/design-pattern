package com.wzy.desingpattern.A18状态模式;

/**
 * 电梯状态抽象
 */
public abstract class AbstractLiftState {

    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void openDoor();

    public abstract void closeDoor();

    public abstract void run();

    public abstract void stop();
}

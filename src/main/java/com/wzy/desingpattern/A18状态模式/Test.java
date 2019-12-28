package com.wzy.desingpattern.A18状态模式;

public class Test {

    public static void main(String[] args) {

        Context context =new Context(Context.openDoorState);

        context.run();
        context.closeDoor();
        context.openDoor();
        context.stop();
    }
}

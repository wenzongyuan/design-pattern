package com.wzy.desingpattern.A10命令模式;

import com.wzy.desingpattern.A10命令模式.InvokerImpl.MyCommandInvoker;
import com.wzy.desingpattern.A10命令模式.commandImpl.SaveUserCommand;
import com.wzy.desingpattern.A10命令模式.commandImpl.UpdateUserCommand;

public class Test {

    public static void main(String[] args) {
        MyCommandInvoker invoker = new MyCommandInvoker();

        SaveUserCommand saveUserCommand = new SaveUserCommand(new User("王二"));
        UpdateUserCommand  updateUserCommand= new UpdateUserCommand(new User("张三"));

        invoker.invokerCommand(saveUserCommand);
        invoker.invokerCommand(updateUserCommand);
    }
}

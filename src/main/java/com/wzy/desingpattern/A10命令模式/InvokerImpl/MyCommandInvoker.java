package com.wzy.desingpattern.A10命令模式.InvokerImpl;

import com.wzy.desingpattern.A10命令模式.CommadInvoker;
import com.wzy.desingpattern.A10命令模式.Command;

/**
 * 实现的命令执行器
 */
public class MyCommandInvoker implements CommadInvoker {

    public void invokerCommand(Command command) {
        command.execute();
    }
}

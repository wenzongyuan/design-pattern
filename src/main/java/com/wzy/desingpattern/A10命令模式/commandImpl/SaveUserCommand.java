package com.wzy.desingpattern.A10命令模式.commandImpl;

import com.wzy.desingpattern.A10命令模式.Command;
import com.wzy.desingpattern.A10命令模式.CommandContext;
import com.wzy.desingpattern.A10命令模式.User;

/**
 * 保存用户命令
 */
public class SaveUserCommand implements Command {

    private User user;

    public void execute() {
        CommandContext.userService.save(user);
    }

    public SaveUserCommand(User user) {
        this.user = user;
    }
}

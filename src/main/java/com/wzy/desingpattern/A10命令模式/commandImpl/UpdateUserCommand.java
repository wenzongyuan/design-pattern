package com.wzy.desingpattern.A10命令模式.commandImpl;

import com.wzy.desingpattern.A10命令模式.Command;
import com.wzy.desingpattern.A10命令模式.CommandContext;
import com.wzy.desingpattern.A10命令模式.User;

/**
 * 更新用户命令
 */
public class UpdateUserCommand implements Command {

    private User user;

    public void execute() {
        CommandContext.userService.update(user);
    }

    public UpdateUserCommand(User user) {
        this.user = user;
    }
}

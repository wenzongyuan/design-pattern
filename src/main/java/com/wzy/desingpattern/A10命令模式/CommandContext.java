package com.wzy.desingpattern.A10命令模式;

/**
 * 命令上下文（主要定义命令的一些通用属性，比如最终处理业务的组件）
 * 我们模拟 单表CRUD的命令模式
 */
public class CommandContext {

   public static UserService userService = new UserService();

}

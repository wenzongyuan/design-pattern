package com.wzy.desingpattern.A13策略模式.impl;

import com.wzy.desingpattern.A13策略模式.IStrategy;

/**
 * 相减策略
 */
public class AddStrategy implements IStrategy {

    public void execute(int a , int b) {
        System.out.println(a + b);
    }
}

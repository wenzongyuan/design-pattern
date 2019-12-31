package com.wzy.desingpattern.A13策略模式;

import com.wzy.desingpattern.A13策略模式.impl.SubStrategy;
import com.wzy.desingpattern.A13策略模式.impl.AddStrategy;

public class Test {

    public static void main(String[] args) {
        //我决定使用ADD策略
        Context context = new Context(new SubStrategy());
        context.invokerStategy(1,3);

        //我需要切换为SUB策略  这就是切换过程
        context = new Context(new AddStrategy());
        context.invokerStategy(5,2);
    }
}

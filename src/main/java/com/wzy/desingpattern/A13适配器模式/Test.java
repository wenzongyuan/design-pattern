package com.wzy.desingpattern.A13适配器模式;

import com.wzy.desingpattern.A13适配器模式.adapter.Computer110zhuan220Adapter;
import com.wzy.desingpattern.A13适配器模式.impl.ChinaPowerSupply;
public class Test {
    public static void main(String[] args) {
        //在国内启动电脑
        System.out.println("在国内开启电脑");
        Computer computer = new Computer(new ChinaPowerSupply());
        computer.start();
        System.out.println("\r\n");

        //在美国启动电脑
        System.out.println("在美国没有电源适配器，电脑无法开启");
        //computer = new Computer(new USAPower());//此会有编译错误，表示在美国我电脑无法使用
        //computer

        System.out.println("\r\n");
        //拯救办法 电压适配器 出场
        System.out.println("在美国买了一个110 --> 220 的电压适配器后开启电脑");
        computer = new Computer(new Computer110zhuan220Adapter());
        computer.start();
    }
}

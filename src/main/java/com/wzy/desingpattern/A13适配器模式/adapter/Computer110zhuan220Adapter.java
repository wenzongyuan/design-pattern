package com.wzy.desingpattern.A13适配器模式.adapter;

import com.wzy.desingpattern.A13适配器模式.IPowerSupply;
import com.wzy.desingpattern.A13适配器模式.USAPower;

/**
 * 电源适配器（在美国使用的时候将110v 转换为220v）
 */
public class Computer110zhuan220Adapter extends USAPower implements IPowerSupply{

    public String getVoltage() {
        return (super.output110VVoltage() * 2 + "");
    }
}

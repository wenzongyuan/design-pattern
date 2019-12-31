package com.wzy.desingpattern.A13适配器模式.impl;

import com.wzy.desingpattern.A13适配器模式.IPowerSupply;

/**
 * 国内电源（默认电压为220V）
 */
public class ChinaPowerSupply implements IPowerSupply {

    public String getVoltage() {
        return "220";
    }
}

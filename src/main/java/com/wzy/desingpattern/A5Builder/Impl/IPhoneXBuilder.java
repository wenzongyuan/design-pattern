package com.wzy.desingpattern.A5Builder.Impl;

import com.wzy.desingpattern.A5Builder.IMobilePhoneBulder;
import com.wzy.desingpattern.A5Builder.MobilePhone;

public class IPhoneXBuilder implements IMobilePhoneBulder {

    MobilePhone mobilePhone = new MobilePhone();
    public void buildScreen() {
        mobilePhone.setScreen("iphoneX柔性屏");
    }
    public void buildBattery() {
        mobilePhone.setBattery("iphoneX快充电池");
    }
    public void buildMicrophone() {
        mobilePhone.setMicrophone("iphoneX特殊听筒");
    }
    public void buildPhoneReceiver() {
        mobilePhone.setPhoneReceiver("iphoneX特殊话筒");
    }
    public void buildPhoneBody() {
        mobilePhone.setPhoneBody("iphoneX黄金机身");
    }
    public MobilePhone build(){
        buildScreen();
        buildBattery();
        buildMicrophone();
        buildPhoneBody();
        buildPhoneReceiver();
        return mobilePhone;
    }
}

package com.wzy.desingpattern.A5Builder.Impl;

import com.wzy.desingpattern.A5Builder.IMobilePhoneBulder;
import com.wzy.desingpattern.A5Builder.MobilePhone;

public class HuaweiP30Builder implements IMobilePhoneBulder {

    MobilePhone mobilePhone = new MobilePhone();
    public void buildScreen() {
        mobilePhone.setScreen("华为柔性屏");
    }
    public void buildBattery() {
        mobilePhone.setBattery("快充电池");
    }
    public void buildMicrophone() {
        mobilePhone.setMicrophone("华为特殊听筒");
    }
    public void buildPhoneReceiver() {
        mobilePhone.setPhoneReceiver("华为特殊话筒");
    }
    public void buildPhoneBody() {
        mobilePhone.setPhoneBody("华为黄金机身");
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

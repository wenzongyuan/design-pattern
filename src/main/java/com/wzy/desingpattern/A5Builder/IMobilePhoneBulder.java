package com.wzy.desingpattern.A5Builder;

public interface IMobilePhoneBulder {

    void buildScreen();
    void buildBattery();
    void buildMicrophone();
    void buildPhoneReceiver();
    void buildPhoneBody();

    MobilePhone build();


}

package com.wzy.desingpattern.A5Builder;

import com.wzy.desingpattern.A5Builder.Impl.HuaweiP30Builder;
import com.wzy.desingpattern.A5Builder.Impl.IPhoneXBuilder;
import com.wzy.desingpattern.A5Builder.Impl.NoPhoneBodyHuaWeiNova5Builder此建造者用于构建没有机身的华为;

public class Test {

    public static void main(String[] args) {

        IMobilePhoneBulder huaweiP30Builder = new HuaweiP30Builder();
        System.out.println(huaweiP30Builder.build());

        IMobilePhoneBulder iPhoneXBuilder = new IPhoneXBuilder();
        System.out.println(iPhoneXBuilder.build());

        IMobilePhoneBulder noPhoneBodyHuaWeiNova5Builder =
                new NoPhoneBodyHuaWeiNova5Builder此建造者用于构建没有机身的华为();
        System.out.println(noPhoneBodyHuaWeiNova5Builder.build());
    }
}

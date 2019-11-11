package com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod;

import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl.BlackHuman;
import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl.HumanFacrtory;
import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl.WirteHuman;
import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl.YellowHuman;

/**
 * 简单工厂模式
 * 特点：扩展方便
 */
public class NvWA女娲 {

    public static void main(String[] args) {

        AbstractHumanFactory factory = new HumanFacrtory();

        IHuman human1 = factory.createHuman(BlackHuman.class);
        IHuman human2 = factory.createHuman(WirteHuman.class);
        IHuman human3 = factory.createHuman(YellowHuman.class);

        System.out.println(human1.getColor());
        System.out.println(human2.getColor());
        System.out.println(human3.getColor());

    }
}

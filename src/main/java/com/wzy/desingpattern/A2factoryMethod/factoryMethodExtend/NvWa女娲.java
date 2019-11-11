package com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend;

import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.factoryImpl.BlackHUmanFactory;
import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.factoryImpl.WriteHumanFactory;
import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.factoryImpl.YellowHumanFactory;

/**
 * 扩展工厂方法模式（将原来的单工厂实例 扩展为多工厂实例）
 */
public class NvWa女娲 {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new YellowHumanFactory();
        IHuman human = factory.createHuman();
        System.out.println(human.getTalk());

        AbstractHumanFactory factory2 = new BlackHUmanFactory();
        IHuman human2 = factory2.createHuman();
        System.out.println(human2.getTalk());

        AbstractHumanFactory factory3 = new WriteHumanFactory();
        IHuman human3 = factory3.createHuman();
        System.out.println(human3.getTalk());
    }
}

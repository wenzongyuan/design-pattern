package com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.factoryImpl;

import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.AbstractHumanFactory;
import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.IHuman;
import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.humanImpl.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

    protected IHuman createHuman() {
        return new YellowHuman();
    }
}

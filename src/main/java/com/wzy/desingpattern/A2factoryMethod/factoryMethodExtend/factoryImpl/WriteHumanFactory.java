package com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.factoryImpl;

import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.AbstractHumanFactory;
import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.IHuman;
import com.wzy.desingpattern.A2factoryMethod.factoryMethodExtend.humanImpl.WirteHuman;

public class WriteHumanFactory extends AbstractHumanFactory {

    @Override
    protected IHuman createHuman() {
        return new WirteHuman();
    }
}

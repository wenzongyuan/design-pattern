package com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl;

import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.AbstractHumanFactory;
import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.IHuman;

/**
 * 具体的工厂
 */
public class HumanFacrtory extends AbstractHumanFactory {

    protected <T extends IHuman> T createHuman(Class <T> t){

        IHuman human = null;

        if (t != null){
            try {
                human = (IHuman) Class.forName(t.getName()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return (T)human;
    }
}

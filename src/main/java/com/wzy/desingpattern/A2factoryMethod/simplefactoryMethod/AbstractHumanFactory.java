package com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod;


public abstract class AbstractHumanFactory {

    protected abstract  <T extends IHuman> T createHuman(Class<T> t);
}

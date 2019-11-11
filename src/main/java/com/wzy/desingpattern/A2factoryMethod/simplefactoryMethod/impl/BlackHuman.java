package com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl;

import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.IHuman;

public class BlackHuman implements IHuman {

    public String getColor() {
        return "黑色";
    }

    public String getLanguage() {
        return "英语";
    }
}

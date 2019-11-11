package com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl;

import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.IHuman;

public class YellowHuman implements IHuman {

    public String getColor() {
        return "黄色";
    }

    public String getLanguage() {
        return "汉语";
    }
}

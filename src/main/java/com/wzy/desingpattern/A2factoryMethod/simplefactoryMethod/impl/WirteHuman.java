package com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.impl;

import com.wzy.desingpattern.A2factoryMethod.simplefactoryMethod.IHuman;

public class WirteHuman implements IHuman {

    public String getColor() {
        return "白色";
    }

    public String getLanguage() {
        return "俄语";
    }
}

package com.wzy.desingpattern.A3AbstractFactory.factoryImpl工厂接口的函数已经定义了第一维度之肤色所以此处为第二维度实现;

import com.wzy.desingpattern.A3AbstractFactory.IHuman;
import com.wzy.desingpattern.A3AbstractFactory.IHumanFactory;
import com.wzy.desingpattern.A3AbstractFactory.humaImpl第一维度之肤色实现.SecondDimensionsImpl第二维度之性别实现.female.FemaleBlackHuman;
import com.wzy.desingpattern.A3AbstractFactory.humaImpl第一维度之肤色实现.SecondDimensionsImpl第二维度之性别实现.female.FemaleWriteHuman;
import com.wzy.desingpattern.A3AbstractFactory.humaImpl第一维度之肤色实现.SecondDimensionsImpl第二维度之性别实现.female.FemaleYellowHuman;

public class FamaleHumanFactory implements IHumanFactory {

    public IHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public IHuman createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public IHuman createWriteHuman() {
        return new FemaleWriteHuman();
    }
}

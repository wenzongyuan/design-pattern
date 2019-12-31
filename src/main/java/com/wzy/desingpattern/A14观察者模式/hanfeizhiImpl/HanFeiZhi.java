package com.wzy.desingpattern.A14观察者模式.hanfeizhiImpl;

import com.wzy.desingpattern.A14观察者模式.IHanFeizhi;

import java.util.Observable;

public class HanFeiZhi extends Observable implements IHanFeizhi {


    public void haveBreakfast() {
        System.out.println("韩非子在吃饭。。。。");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭。。。。");
    }

    public void haveFun() {
        System.out.println("韩非子在唱K。。。。");
        super.setChanged();
        super.notifyObservers("韩非子在唱K。。。。");
    }
}

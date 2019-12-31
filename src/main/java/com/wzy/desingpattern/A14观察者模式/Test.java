package com.wzy.desingpattern.A14观察者模式;

import com.wzy.desingpattern.A14观察者模式.hanfeizhiImpl.HanFeiZhi;
import com.wzy.desingpattern.A14观察者模式.observer.LISi;

public class Test {

    public static void main(String[] args) {

        IHanFeizhi hanFeizhi = new HanFeiZhi();
        ((HanFeiZhi) hanFeizhi).addObserver(new LISi());

        hanFeizhi.haveBreakfast();
        hanFeizhi.haveFun();
    }
}

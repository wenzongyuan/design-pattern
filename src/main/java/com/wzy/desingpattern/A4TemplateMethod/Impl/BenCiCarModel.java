package com.wzy.desingpattern.A4TemplateMethod.Impl;

import com.wzy.desingpattern.A4TemplateMethod.AbstractCarModel;

public class BenCiCarModel extends AbstractCarModel {

    @Override
    protected void start() {
        System.out.println("奔驰启动。。。。。");
    }
    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎轰鸣。。。。。");
    }
    @Override
    protected void stop() {
        System.out.println("奔驰停车。。。。。");
    }
    @Override
    protected void alarm() {
        System.out.println("哔哔哔。。。。。");
    }
    /** 重写钩子方法，让奔驰车叫起来
     * @return*/
    @Override
    protected boolean isAlarm() {
        return true;
    }
}

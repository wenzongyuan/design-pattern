package com.wzy.desingpattern.A4TemplateMethod.Impl;

import com.wzy.desingpattern.A4TemplateMethod.AbstractCarModel;

public class BWCarModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("宝马启动。。。。。");
    }
    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎轰鸣。。。。。");
    }
    @Override
    protected void stop() {
        System.out.println("宝马停车。。。。。");
    }
    @Override
    protected void alarm() {
        System.out.println("哔哔哔。。。。。");
    }
    //使用父类的钩子方法，默认不叫，因此宝马不叫。。。
}

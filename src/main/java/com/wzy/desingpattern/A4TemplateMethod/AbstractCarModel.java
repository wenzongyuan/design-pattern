package com.wzy.desingpattern.A4TemplateMethod;

public abstract class AbstractCarModel {
    /*** 汽车模型：需求一：模拟跑的过程：
     * 1.启动
     * 2.引擎轰鸣
     * 3.停止
     * 需求二：停止前要能叫，而且这个叫完全由用户控制,默认为不叫*/
    protected abstract void start();
    protected abstract void engineBoom();
    protected abstract void alarm();
    protected abstract void stop();
    //此方法为钩子方法：在接口或抽象类中，子类通过实现此钩子方法，就能改变模版方法的逻辑。
    protected boolean isAlarm(){
        return false;
    }
    public final void run(){
        //1 启动
        this.start();
        //2 引擎轰鸣
        this.engineBoom();
        if (isAlarm()){
            this.alarm();
        }
        //停车
        this.stop();
    }
}

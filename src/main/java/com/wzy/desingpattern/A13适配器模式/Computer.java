package com.wzy.desingpattern.A13适配器模式;

public class Computer {

    private IPowerSupply powerSupply;

    public Computer(IPowerSupply powerSupply){
        this.powerSupply = powerSupply;
    }

    public void start(){

        if (powerSupply.getVoltage().equals("220")){
            System.out.println("成功启动电脑。。。");
        }else {
            System.out.println("电源电压不匹配，启动失败");
        }
    }
}

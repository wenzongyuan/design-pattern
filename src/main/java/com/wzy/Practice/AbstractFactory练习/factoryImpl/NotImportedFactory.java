package com.wzy.Practice.AbstractFactory练习.factoryImpl;

import com.wzy.Practice.AbstractFactory练习.ICar;
import com.wzy.Practice.AbstractFactory练习.ICarFactory;
import com.wzy.Practice.AbstractFactory练习.第一维度品牌抽象实现.第二维度是否进口实现.false非进口.NotImportedAuDirCar;
import com.wzy.Practice.AbstractFactory练习.第一维度品牌抽象实现.第二维度是否进口实现.false非进口.NotImportedBWCar;
import com.wzy.Practice.AbstractFactory练习.第一维度品牌抽象实现.第二维度是否进口实现.false非进口.NotImportedBenCiCar;

public class NotImportedFactory implements ICarFactory {

    public ICar createBenCiCar() {
        return new NotImportedBenCiCar();
    }

    public ICar createBWCar() {
        return new NotImportedBWCar();
    }

    public ICar createAuDirCar() {
        return new NotImportedAuDirCar();
    }
}

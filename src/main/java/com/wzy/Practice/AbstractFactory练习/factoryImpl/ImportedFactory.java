package com.wzy.Practice.AbstractFactory练习.factoryImpl;

import com.wzy.Practice.AbstractFactory练习.ICar;
import com.wzy.Practice.AbstractFactory练习.ICarFactory;
import com.wzy.Practice.AbstractFactory练习.第一维度品牌抽象实现.第二维度是否进口实现.true进口.ImportedAuDirCar;
import com.wzy.Practice.AbstractFactory练习.第一维度品牌抽象实现.第二维度是否进口实现.true进口.ImportedBWCar;
import com.wzy.Practice.AbstractFactory练习.第一维度品牌抽象实现.第二维度是否进口实现.true进口.ImportedBenCiCar;

public class ImportedFactory implements ICarFactory {

    public ICar createBenCiCar() {
        return new ImportedBenCiCar();
    }

    public ICar createBWCar() {
        return new ImportedBWCar();
    }

    public ICar createAuDirCar() {
        return new ImportedAuDirCar();
    }
}

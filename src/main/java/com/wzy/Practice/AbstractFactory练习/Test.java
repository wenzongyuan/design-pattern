package com.wzy.Practice.AbstractFactory练习;

import com.wzy.Practice.AbstractFactory练习.factoryImpl.ImportedFactory;
import com.wzy.Practice.AbstractFactory练习.factoryImpl.NotImportedFactory;

public class Test {

    public static void main(String[] args) {

        ICarFactory importCarFactory = new ImportedFactory();
        ICar auDirCar = importCarFactory.createAuDirCar();
        ICar benCiCar = importCarFactory.createBenCiCar();
        ICar bwCar = importCarFactory.createBWCar();

        System.out.println(auDirCar.getBrand() + auDirCar.isImported());
        System.out.println(benCiCar.getBrand() + benCiCar.isImported());
        System.out.println(bwCar.getBrand() + bwCar.isImported());

        System.out.println("---------------------------------------------");

        ICarFactory notImportCarFactory = new NotImportedFactory();
        ICar auDirCar1 = notImportCarFactory.createAuDirCar();
        ICar benCiCar1 = notImportCarFactory.createBenCiCar();
        ICar bwCar1 = notImportCarFactory.createBWCar();
        System.out.println(auDirCar1.getBrand() + auDirCar1.isImported());
        System.out.println(benCiCar1.getBrand() + benCiCar1.isImported());
        System.out.println(bwCar1.getBrand() + bwCar1.isImported());

    }
}

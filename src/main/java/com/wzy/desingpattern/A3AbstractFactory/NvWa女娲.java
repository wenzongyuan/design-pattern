package com.wzy.desingpattern.A3AbstractFactory;

import com.wzy.desingpattern.A3AbstractFactory.factoryImpl工厂接口的函数已经定义了第一维度之肤色所以此处为第二维度实现.FamaleHumanFactory;
import com.wzy.desingpattern.A3AbstractFactory.factoryImpl工厂接口的函数已经定义了第一维度之肤色所以此处为第二维度实现.MaleHumanFactory;

/**
 * 总结：
 * 抽象工厂模式 主要解决的问题是：实例存在两个及以上维度的问题，
 * 比如 人：从肤色的维度有三种肤色
 *          从性别的维度有两种性别
 *          组合起来就是6种人（对应6中具体的实现），类似排列组合。
 *  注意点：
 *    1、工厂接口的方法职责需要确定产品一种维度：比如：
 *       我们的IHumanFactory里面中的方法
 *       createYellowHuman、createBlackHuman、createWriteHuman
 *       就能确定人的肤色维度。
 *
 *    2、子工厂的职责也需要确定产品一种维度：比如：
 *       我们的FamaleHumanFactory、MaleHumanFactory就能确定人的性别维度。
 *
 *    3、产品的有一个维度需要抽象确定。
 *       我们的AbstractBlackHuman、AbstractWriteHuman、AbstractYellowHuman就是抽象类，并且确定了
 *       肤色维度。
 *
 *    4、产品的抽象确定的维度 = 接口方法确定的维度。
 *       如本例子中的：抽象确定的维度 = 肤色
 *                     接口方法确定的维度 = 肤色
 */
public class NvWa女娲 {

    public static void main(String[] args) {

        IHumanFactory maleFactory = new MaleHumanFactory();
        IHuman blackHuman = maleFactory.createBlackHuman();
        IHuman writeHuman = maleFactory.createWriteHuman();
        IHuman yellowHuman = maleFactory.createYellowHuman();
        System.out.println(blackHuman.getColor() + blackHuman.getGender());
        System.out.println(writeHuman.getColor() + writeHuman.getGender());
        System.out.println(yellowHuman.getColor() + yellowHuman.getGender());

        System.out.println("----------------------------------------------");

        IHumanFactory femaleFactory = new FamaleHumanFactory();
        IHuman blackHuman1 = femaleFactory.createBlackHuman();
        IHuman writeHuman1 = femaleFactory.createWriteHuman();
        IHuman yellowHuman1 = femaleFactory.createYellowHuman();
        System.out.println(blackHuman1.getColor() + blackHuman1.getGender());
        System.out.println(writeHuman1.getColor() + writeHuman1.getGender());
        System.out.println(yellowHuman1.getColor() + yellowHuman1.getGender());


    }
}

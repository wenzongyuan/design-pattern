package com.wzy.desingpattern.A12装饰器模式;

/**
 * 成绩单接口
 */
public interface ISchoolReport {

    //汇报成绩
    void reportGrade();

    //家长签名
    void sign(String name);
}

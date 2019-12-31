package com.wzy.desingpattern.A12装饰器模式.Impl;

import com.wzy.desingpattern.A12装饰器模式.ISchoolReport;

/**
 * 四年级时候的成绩单
 */
public class FouthGradeSchoolReport implements ISchoolReport {

    public void reportGrade() {
        System.out.println("语文 60 数据 60");
    }

    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}

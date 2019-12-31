package com.wzy.desingpattern.A12装饰器模式.Impl;

import com.wzy.desingpattern.A12装饰器模式.ISchoolReport;

/**
 * 抽象装饰器
 */
public abstract class AbstractDecorator implements ISchoolReport {

    //被装饰的实例（此处为成绩单）
    private ISchoolReport schoolReport;

    public AbstractDecorator(ISchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    public void reportGrade() {
        this.schoolReport.reportGrade();
    }

    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}

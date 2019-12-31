package com.wzy.desingpattern.A12装饰器模式.Impl.decoratorImpl;

import com.wzy.desingpattern.A12装饰器模式.ISchoolReport;
import com.wzy.desingpattern.A12装饰器模式.Impl.AbstractDecorator;

/**
 * （先报告班级科目最高分）的装饰器
 * 也就是说在报告成绩之前先说一下最高分
 */
public class RepotHightGradeDecorator extends AbstractDecorator {

    public RepotHightGradeDecorator(ISchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void reportGrade() {
        //1.先报告班级最高分
        this.reportHightGrade();
        //2.再报告自己的成绩
        super.reportGrade();
    }

    public void reportHightGrade(){
        System.out.println("班级语文最高分 70  班级数学最高分 70");
    }
}

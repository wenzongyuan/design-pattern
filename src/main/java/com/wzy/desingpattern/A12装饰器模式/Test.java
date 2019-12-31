package com.wzy.desingpattern.A12装饰器模式;

import com.wzy.desingpattern.A12装饰器模式.Impl.FouthGradeSchoolReport;
import com.wzy.desingpattern.A12装饰器模式.Impl.decoratorImpl.RepotHightGradeDecorator;
import com.wzy.desingpattern.A12装饰器模式.Impl.decoratorImpl.RepotSortDecorator;


/**
 * 模拟父亲查看成绩单并签名的场景
 */
public class Test {
    public static void main(String[] args) {

        //先创建被装饰的对象。
        ISchoolReport schoolReport = new FouthGradeSchoolReport();

        //将其装饰为先报告最高分的成绩单
        schoolReport = new RepotHightGradeDecorator(schoolReport);

        //再将“先报告最高的成绩单” 装饰为 “报告完最高分和成绩后再报告排名的成绩单”
        schoolReport = new RepotSortDecorator(schoolReport);

        //最终的成绩就是 “报告完最高分和成绩后再报告排名的成绩单”，将原来的FouthGradeSchoolReport
        //装饰了两次，既能 先报告最高的成绩单 也能 报告自己的排名。
        schoolReport.reportGrade();

        schoolReport.sign("wen");
    }
}

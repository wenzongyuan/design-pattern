package com.wzy.desingpattern.A12装饰器模式.Impl.decoratorImpl;

import com.wzy.desingpattern.A12装饰器模式.ISchoolReport;
import com.wzy.desingpattern.A12装饰器模式.Impl.AbstractDecorator;

/**
 * 排名报告装饰器
 * 也就是说报告完自己的成绩后，再说一下自己的排名
 */
public class RepotSortDecorator extends AbstractDecorator {

    public RepotSortDecorator(ISchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void reportGrade() {
        //1.先报告自己的成绩
        super.reportGrade();
        //2.再报告排名
        this.reportSort();
    }

    private void reportSort(){
        System.out.println("排名为12");
    }
}

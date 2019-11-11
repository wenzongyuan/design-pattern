package com.wzy.desingpattern.A4TemplateMethod;

import com.wzy.desingpattern.A4TemplateMethod.Impl.BWCarModel;
import com.wzy.desingpattern.A4TemplateMethod.Impl.BenCiCarModel;

public class Test {

    public static void main(String[] args) {

        AbstractCarModel model = new BenCiCarModel();
        model.run();

        AbstractCarModel model2 = new BWCarModel();
        model2.run();
    }
}

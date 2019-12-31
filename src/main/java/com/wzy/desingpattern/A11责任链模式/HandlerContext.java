package com.wzy.desingpattern.A11责任链模式;

import com.wzy.desingpattern.A11责任链模式.impl.DollarHandler;
import com.wzy.desingpattern.A11责任链模式.impl.RMBHandler;

/**
 * 责任链初始定义上线文(一般情况用于确定处理顺序（也就是责任链的顺序）)
 */
public class HandlerContext {

    /**
     * 获取责任链的第一个处理器
     * @return
     */
   static AbstractHandler getHandler(){

        AbstractHandler rmbHandler = new RMBHandler();
        AbstractHandler usaHandler = new DollarHandler();

        rmbHandler.setNextHandler(usaHandler);

        return rmbHandler;
    }
}

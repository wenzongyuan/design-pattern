package com.wzy.desingpattern.A11责任链模式;

/*** 抽象的处理器*/
public abstract class AbstractHandler{
    private AbstractHandler nextHandler;

    public final void handlerBusiness(CustomerBusiness customerBusiness) {
        if (customerBusiness != null){
            if (this.isMyHandlerResponsibility(customerBusiness.getCurrency())){
                //如果是我的处理职责，那就我来处理
                this.doHandler(customerBusiness);
            }else {
                //如果不是我的职责那就交给我的下一个处理器去处理
                if (this.nextHandler != null){
                    this.nextHandler.handlerBusiness(customerBusiness);
                }else {
                    //如果我的下一个处理器没有，那就给出错误请求的结果
                    System.out.println("暂无此币种业务处理。。。");
                }
            }
        }
    }
    /**抽象是否属于自己的责任*/
    protected abstract boolean isMyHandlerResponsibility(String currency);
    /**真正开始处理业务*/
    protected abstract void doHandler(CustomerBusiness customerBusiness);
    /** 获取下一个处理器*/
    public AbstractHandler getNextHandler() {return nextHandler; }
    /**设置自己的下一个处理器*/
    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

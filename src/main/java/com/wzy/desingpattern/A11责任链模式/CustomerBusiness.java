package com.wzy.desingpattern.A11责任链模式;

/**
 * 客户（模拟用户存钱的场景（不同币种））
 */
public class CustomerBusiness {

    private String name;

    private String currency;

    public CustomerBusiness(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

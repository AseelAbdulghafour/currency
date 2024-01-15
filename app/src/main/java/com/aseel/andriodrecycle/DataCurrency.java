package com.aseel.andriodrecycle;

public class DataCurrency {
    private  String name;
    private String code;
    private Double exchange;
    public DataCurrency(String name,String code,double exchange){
        this.name=name;
        this.code=code;
        this.exchange=exchange;
    }

    public Double getExchange() {
        return exchange;
    }

    public void setExchange(Double exchange) {
        this.exchange = exchange;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

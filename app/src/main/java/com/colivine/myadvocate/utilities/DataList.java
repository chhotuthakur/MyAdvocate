package com.colivine.myadvocate.utilities;

public class DataList {

    private String callamount,market,price;

    public DataList(String callamount, String market, String price) {
        this.callamount = callamount;
        this.market = market;
        this.price = price;
    }

    public String getCallamount() {
        return callamount;
    }

    public String getMarket() {
        return market;
    }

    public String getPrice() {
        return price;
    }
}

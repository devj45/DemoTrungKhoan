package com.company.model;

import java.util.Map;

public class Trader extends User{
    Integer idTrader;
    String nameTrader;
    String address;
    Map<Stock,Integer> stocks;


    public Trader(String idUser, String name, String email, String phone, Integer idTrader, String nameTrader, String address, Map<Stock, Integer> stocks) {
        super(idUser, name, email, phone);
        this.idTrader = idTrader;
        this.nameTrader = nameTrader;
        this.address = address;
        this.stocks = stocks;
    }

    public Integer getIdTrader() {
        return idTrader;
    }

    public void setIdTrader(Integer idTrader) {
        this.idTrader = idTrader;
    }

    public String getNameTrader() {
        return nameTrader;
    }

    public void setNameTrader(String nameTrader) {
        this.nameTrader = nameTrader;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Stock, Integer> getStocks() {
        return stocks;
    }

    public void setStocks(Map<Stock, Integer> stocks) {
        this.stocks = stocks;
    }
}

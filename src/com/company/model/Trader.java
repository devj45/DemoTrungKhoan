package com.company.model;

import java.util.Map;

public class Trader extends User{
    Integer idTrader;
    String name;
    String address;
    Map<Stock,Integer> stocks;


    public Trader(String idUser, String name, String email, String phone) {
        super(idUser, name, email, phone);
    }

    public Trader(String idUser, String name, String email, String phone, Integer idTrader, String name1, String address, Map<Stock, Integer> stocks) {
        super(idUser, name, email, phone);
        this.idTrader = idTrader;
        this.name = name1;
        this.address = address;
        this.stocks = stocks;
    }

    public Integer getIdTrader() {
        return idTrader;
    }

    public void setIdTrader(Integer idTrader) {
        this.idTrader = idTrader;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

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
}

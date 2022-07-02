package com.company.model;

//Cổ phiếu niêm yết trên sàn
public class Stock {
    String idStock;
    String name;
    Integer amount;
    Integer price;
    String idCompany;

    public Stock(String idStock, String name, Integer amount, Integer price, String idCompany) {
        this.idStock = idStock;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.idCompany = idCompany;
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }
}

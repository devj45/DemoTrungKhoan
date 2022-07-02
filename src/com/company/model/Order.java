package com.company.model;

import java.util.Date;

public class Order {
    Integer idOrder;
    Integer idTrader;
    String idStock;
    Date orderDate;
    Integer Amount;
    Integer Price;
    Boolean type;

    public Order(Integer idOrder, Integer idTrader, String idStock, Date orderDate, Integer amount, Integer price, Boolean type) {
        this.idOrder = idOrder;
        this.idTrader = idTrader;
        this.idStock = idStock;
        this.orderDate = orderDate;
        Amount = amount;
        Price = price;
        this.type = type;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdTrader() {
        return idTrader;
    }

    public void setIdTrader(Integer idTrader) {
        this.idTrader = idTrader;
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}

package com.company.model;

import java.util.Date;

public class Transaction {
    Integer idTransaction;
    Date TranDate;
    String idStock;
    Integer OrderSellId;
    String TraderSellId;
    Integer OrderBuyId;
    String TraderBuyId;
    Integer Amount;
    Integer Price;

    public Transaction(Integer idTransaction, Date tranDate, String idStock, Integer orderSellId, String traderSellId, Integer orderBuyId, String traderBuyId, Integer amount, Integer price) {
        this.idTransaction = idTransaction;
        TranDate = tranDate;
        this.idStock = idStock;
        OrderSellId = orderSellId;
        TraderSellId = traderSellId;
        OrderBuyId = orderBuyId;
        TraderBuyId = traderBuyId;
        Amount = amount;
        Price = price;
    }

    public Integer getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Integer idTransaction) {
        this.idTransaction = idTransaction;
    }

    public Date getTranDate() {
        return TranDate;
    }

    public void setTranDate(Date tranDate) {
        TranDate = tranDate;
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public Integer getOrderSellId() {
        return OrderSellId;
    }

    public void setOrderSellId(Integer orderSellId) {
        OrderSellId = orderSellId;
    }

    public String getTraderSellId() {
        return TraderSellId;
    }

    public void setTraderSellId(String traderSellId) {
        TraderSellId = traderSellId;
    }

    public Integer getOrderBuyId() {
        return OrderBuyId;
    }

    public void setOrderBuyId(Integer orderBuyId) {
        OrderBuyId = orderBuyId;
    }

    public String getTraderBuyId() {
        return TraderBuyId;
    }

    public void setTraderBuyId(String traderBuyId) {
        TraderBuyId = traderBuyId;
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
}

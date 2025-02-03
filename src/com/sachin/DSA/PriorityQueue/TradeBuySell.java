package com.sachin.DSA.PriorityQueue;

public class TradeBuySell
{
    int id;
    private String BuySell;
    private String Ticker;
    private double price;
    private int quantity;

    public TradeBuySell(int id, String BuySell, String Ticker, double price, int quantity)
    {
        this.id = id;
        this.BuySell = BuySell;
        this.Ticker = Ticker;
        this.price = price;
        this.quantity = quantity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TradeBuySell{" +
                "id=" + id +
                ", BuySell=" + BuySell +
                ", Ticker='" + Ticker + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getBuySell() {
        return BuySell;
    }

    public void setBuySell(String buySell) {
        BuySell = buySell;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicker() {
        return Ticker;
    }

    public void setTicker(String ticker) {
        Ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

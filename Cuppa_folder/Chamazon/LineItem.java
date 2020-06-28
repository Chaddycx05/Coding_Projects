package com.company;

public class LineItem {
    private int quantity;
    private Price price;
    private Product product;


    public LineItem(int q,Product prod, Price p) {
        quantity = q;
        product = prod;
        price = p;
    }
    /**Get total of this LineItem by multiply quantity by price*/
    public double getTotal(){
        return price.getAmount() * quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public Price getPrice(){
        return price;
    }


    public String toString() {
        return quantity + "x" + price + ": Total:" + getTotal() + " " + price.getCurrency();
    }
}

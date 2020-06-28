package com.company;
import java.util.Date;
public class Shopping_Cart {
    private Date created_date;
    private int cartSize;
    private LineItem[] lineItems;

    /**Create and empty instance of Shopping_cart*/
    public Shopping_Cart(){
        created_date = new Date();
        lineItems = new LineItem[100];
        cartSize = 0;
    }
    /**Add lineItems to the shopping cart*/
    public void addLineItem(LineItem item){
        lineItems[cartSize] = item;
        cartSize++;
    }

    /**Get all LineItems in this ShoppingCart*/
    public LineItem[] getItems(){
        return lineItems;
    }

    /**Get amount of LineItems in this ShoppingCart*/
    public int getSize(){
        return cartSize;
    }

    /**This will delete all items in this shopping cart- max 100 items*/
    public void makeEmpty(){
        cartSize = 0;
        lineItems = new LineItem[100];
    }

    public String toString(){
        String out = "";
        for(int i = 0; i<cartSize;i++){
            out+=(lineItems[i]+"\n");
        }
        return out;
    }

}

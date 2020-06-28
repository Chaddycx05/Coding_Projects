package com.company;
import java.util.Date;

/**
 * Account owns shopping cart and has orders
 * */
public class Account {

    private String id;
    private Address billing_address;
    private Boolean is_closed;
    private Date Date_opened;
    private Date Date_closed;
    private Shopping_Cart cart;
    private Orders[] orders;
    private int orderSize = 0;
    private static long idCounter = 0;
    /**Create a unique sequential ID*/
    private static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    /**Create an Object of Account*/
    public Account(){
        id = createID();
        is_closed =false;
        Date_opened = new Date();
        cart = new Shopping_Cart();
        orders = new Orders[100];

    }


    /**Create an Account Object instance with webUse as the id*/
    public Account(String Web_user){
        id = Web_user;
        is_closed = false;
        Date_opened =  new Date();
        cart = new Shopping_Cart();
        orders = new Orders[100];
    }

    /**Create instance of Account with billint address updated*/
    public Account(Address a){
        id = createID();
        billing_address = a;
        is_closed = false;
        Date_opened = new Date();
        cart = new Shopping_Cart();
        orders = new Orders[100];
    }

    public String getId() {
        return id;
    }

    public Orders[] getOrders(){
        return orders;
    }

    public Shopping_Cart getCart(){
        return cart;
    }

    public void setID(String i){
        id = i;
    }

    public void setBilling_address(Address ba) {
        billing_address = ba;
    }



    public int getOrderSize(){
        return orderSize;
    }

    public Orders createOrder(){
        Orders order = new Orders();
        order.convertCartToOrder(this);
        orders[orderSize] = order;
        orderSize++;

        return order;
    }


    public Address getBilling_address() {
        return billing_address;
    }

    public void closeAccount(){
        Date_closed = new Date();
        is_closed = true;
    }

    public String toString(){

    }

}

package com.company;

public class Product {
    private String id;
    private String name;
    private Supplier supplier;
    private static long idCounter = 0;

    /**Creat unique sequential ID*/
    private static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    /**Create an instance of Product*/
    public Product(String n, Supplier s){
        id = createID();
        name = n;
        supplier = s;
    }

    public String toString(){
        return "PRODUCT:" + id + ":" + name + " FROM:" + supplier;
    }

}

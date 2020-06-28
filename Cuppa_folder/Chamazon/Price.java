package com.company;

public class Price {
    /**
     * Price stores the money amount of a LineItem
     * paired with currency information.
     * */
    public enum Currency{
        USD,EURO, GBP
    }
    private Currency currency;
    private double amount;

    /** Create an instance of Price*/
    public Price(Currency c, double a){
        currency = c;
        amount = a;
    }

    double getAmount(){
        return amount;
    }

    public Currency getCurrency(){
        return currency;
    }

    public String toString(){
        return amount +" "+currency;
    }

}

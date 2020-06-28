package com.company;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    /** This will create an empty instance of Address */
    public Address(){
        street = "";
        city = "";
        state = "";
        zipcode = "";
        country = "";
    }

    /** Create an instance of Address w/ (street, city, state, zipcode, country)*/
    public Address(String x1, String x2, String x3, String x4, String x5){
        street = x1;
        city = x2;
        state = x3;
        zipcode = x4;
        country = x5;
    }


    public String toString(){
        if(street == "")
            return "NO:ADDRESS:FOUND";
        return this.street + "," + this.city + "," + this.state + ","+ this.zipcode+ "," + this.country;
    }
}

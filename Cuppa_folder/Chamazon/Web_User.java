package com.company;

public class Web_User extends Customer{
    public Web_User(String password, String id, String Address, String Email, int phone) {
        if(password == "password") {
            new Customer(id, Address, Email, phone);
        }

    }
}

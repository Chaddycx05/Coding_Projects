package com.company;

/**
 * I am simulating an Address class, and Phone class by having them as a string
 * and populating them
 * */
public class Customer {
    private String id;
    private String Address;
    private String Phone;
    private String Email;

    public Customer(String id, String Address, String Email, int phone){
        this.id = id;
        this.Address = Address;
        this.Email = Email;
        this.Phone = Integer.toString(phone);
    }

    public Customer() {
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

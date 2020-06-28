package com.company;

public class Phone {
    /**
     * Phone Class stores phone numbers formatted as a two part string. The Area code is
     * separated from the phone number */
    private String areaCode;
    private String numberCode;

    public Phone(String x1, String x2){
        areaCode = x1;
        numberCode = x2;
    }


    public String toString() {
        return areaCode + " " + numberCode;
    }
}

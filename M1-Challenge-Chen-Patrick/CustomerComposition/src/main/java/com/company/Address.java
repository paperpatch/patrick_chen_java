package com.company;

public class Address {
    private String Street1;
    private String Street2;
    private String City;
    private String State;
    private String Zipcode;

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String street1) {
        Street1 = street1;
    }

    public String getStreet2() {
        return Street2;
    }

    public void setStreet2(String street2) {
        Street2 = street2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street1='" + Street1 + '\'' +
                ", Street2='" + Street2 + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zipcode='" + Zipcode + '\'' +
                '}';
    }
}

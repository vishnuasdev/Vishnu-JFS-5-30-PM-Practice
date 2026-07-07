package org.example;

public class Address {

    private int no;
    private String city;
    private int pincode;

    public Address(int no, String city, int pincode){
        this.no = no;
        this.city = city;
        this.pincode = pincode;
    }

    public void display(){
        System.out.println("Door No: " + no);
        System.out.println("City: "+ city);
        System.out.println("Pincode: " + pincode);
    }


//    public Address(String city){
//        this.city = city;
//    }
//
//
//    public Address(String city, int pincode){
//        this.city = city;
//        this.pincode = pincode;
//    }
//
//    public String getCity(){
//        return city;
//    }
//
//    public String getPincode(){
//        return pincode;
//    }
}

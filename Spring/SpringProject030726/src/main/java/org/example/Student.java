package org.example;

public class Student {
//    private String name;
//    private String course;

    private Address address;

    public Student(Address address){
//        this.name = name;
//        this.course = course;
        this.address = address;
    }

    public void display(){
//        System.out.println("Name: "+ name);
//        System.out.println("Course: "+ course);

//        System.out.println("City: "+ address.getCity());
//        System.out.println("Pincode: "+ address.getPincode());
        address.display();
    }
}

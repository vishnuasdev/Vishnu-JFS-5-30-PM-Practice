package org.example;

public class Student {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("City: "+ address.getCity());
    }

    //    private String name;
//    private String city;
//    private int age;

//    private Course course;
//    private Trainer trainer;

//    public void setTrainer(Trainer trainer){
//        this.trainer = trainer;
//    }
//
//    public void setCourse(Course course){
//        this.course = course;
//    }
//
//    public void display(){
//        System.out.println("Student Class");
//
//        course.courseInfo();
//        trainer.trainerInfo();
//    }


//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setCity(String city){
//        this.city = city;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//
//    public void display(){
//        System.out.println("Name: " + name );
//        System.out.println("City: "+ city);
//        System.out.println("Age: "+ age);
//    }
}

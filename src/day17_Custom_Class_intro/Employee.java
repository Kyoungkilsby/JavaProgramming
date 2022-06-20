package day17_Custom_Class_intro;

public class Employee {//instance variable
    //first you have to think what information  do you want to store in that object

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;


    //how to create setInfo
    //Right click go generate and constructor
    //Delete Employee write "void setInfo"
    //why void cause there is no date that you need to return from this method. i don't need return value
    //but if you put "int"or "String" you have to put "return"the value!!!!

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;//parameter and instance variables are same name
        this.age = age;            // to call the instance Use "THIS"//
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }//set all the attributes of the Employee object at once


    public String toString() { //avoid getting hash-cord when we  print  employee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }//avoid getting

    public void work() {//this is instance method
        System.out.println(name + " is working");//make this method instances because if this method is not instance,
        // then you cannot use any of those variables.//if use static can not call the variable
    }

}




   // Every time when this setInfor method, since setInfor method is  instance method,
// how do you call it later ::: through the object.

      //  instances, you must call them through the object,
//  when this setInfor method is being called through the object six argument has to be provided.
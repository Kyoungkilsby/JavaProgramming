package day17_Custom_Class_intro;

public class Dog {// six instance variable
    public String name;// instance variable
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color; //

    public void setInfo(String name,String breed, char gender,int age,String size,String color) {
        this.name = name;//"this" keyword is used for calling the instance variable name
        this.breed = breed;//if
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }//this method can help us to set all the information of the dog at once

    public void eat() {//  instance method
        System.out.println(name + " is eating");
    }

    public void drink() {//instance method
        System.out.println(name + " is drinking water");

    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

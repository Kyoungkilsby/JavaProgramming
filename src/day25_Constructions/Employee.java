package day25_Constructions;

import java.time.LocalDate;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jibTitle;
    public double salary;
    public LocalDate hire_date;

    public Employee(String name, int age, char gender, String jibTitle, double salary, LocalDate hire_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jibTitle = jibTitle;
        this.salary = salary;
        this.hire_date = hire_date;
    }//allows us to set all the instance variables of the object as soon as


    public String toString() {
        return "day25_Constructions.Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jibTitle='" + jibTitle + '\'' +
                ", salary=" + salary +
                ", hire_date=" + hire_date +
                '}';
    }//allows us to print the object
}
/*
* name
* age
* gender
* jobTitle
* salary
* hired date*/
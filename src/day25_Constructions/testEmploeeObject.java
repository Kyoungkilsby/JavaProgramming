package day25_Constructions;

import java.time.LocalDate;

public class testEmploeeObject {

    public static void main(String[] args) {

        Employee e1= new Employee("Johna",24,'F',"Java Developer",90000, LocalDate.of(2002,12,5));

        Employee e2 =new Employee("Bob",34,'M',"Project Manager",98000,LocalDate.of(2202,1,4));
        System.out.println(e1);
    }
}

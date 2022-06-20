package day24_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {


        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel",'M', LocalDate.of(1995,5,25));
        people[1].setInfo("Joe",'F',LocalDate.of(2000,2,2));
        people[2].setInfo("Jin", 'F',LocalDate.of(1980,4,12));
        people[3].setInfo("Kim",'M',LocalDate.of(1999,9,19));
        people[4].setInfo("Soo",'F',LocalDate.of(1974,3,13));

        ArrayList<Person>studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        System.out.println(Arrays.toString(people));

        //print name &date of birth of each person object

        //remove all the person that has the age >55



    }
}
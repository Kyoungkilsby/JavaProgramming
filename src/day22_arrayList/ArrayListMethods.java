package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//0 //add method is overload method
        list.add(20);//1
        list.add(30);//2
        list.add(40);//3

        list.add(1,15);
        list.add(2,25);
        System.out.println(list);

        System.out.println("_____________________");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("kim");
        studentList.add("Lee");
        studentList.add("Park");
        studentList.add("Jin");

        System.out.println(studentList.size());//
        System.out.println(studentList);

        String firstStudent= studentList.get(0);
        String lastStudent = studentList.get(3);

        System.out.println(firstStudent);
        System.out.println(lastStudent);






    }
}

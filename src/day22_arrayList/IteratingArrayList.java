package day22_arrayList;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        //numbers.add(77,255); index number order
        System.out.println(numbers);//100,200,300,255,400,500
                  //index number       0    1   2   3  4
        System.out.println("_______________________________");

        for(int i=0; i< numbers.size();i++){
         // int each=
                  numbers.get(i);
            System.out.println(numbers.get(i));
        }
        System.out.println("______________________");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            numbers.get(i);
            System.out.println(numbers.get(i));
        }
        System.out.println("########################");
        for (Integer each : numbers) {
            System.out.println(each);

        }












    }
}

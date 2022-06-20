package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[]array= {1,2,3,4,5,};
        array[0] = 100;
        System.out.println(Arrays.toString(array));
        System.out.println("__________________");

        ArrayList<String>groceriesList = new ArrayList<>();

        groceriesList.add("Egg");
        groceriesList.add("Paper towel");
        groceriesList.add("water");
        groceriesList.add("soda");

        groceriesList.set(2,"Oranges");// change the element same size
        System.out.println(groceriesList);

        groceriesList.add(2,"chicken");
        System.out.println(groceriesList);//increase the size shift to the right

        System.out.println("______________________________");


        groceriesList.remove(2);
        System.out.println(groceriesList);
        groceriesList.remove("Oranges");//two
        System.out.println(groceriesList);


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

         boolean r1 = numbers.remove((Integer.valueOf(10)));
        System.out.println(r1);

        numbers.remove(2);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);//[]

        ArrayList<String> names= new ArrayList<>();


        names.add("Kim");
        names.add("Kim");
        names.add("LEE");
        names.add("LEE");
        names.add("JIn");
        names.add("LEE");
        names.add("Kim");

        System.out.println(names.indexOf("Kim"));//0
        System.out.println(names.lastIndexOf("Kim"));//6
        System.out.println(names.lastIndexOf("LEE"));//5
        System.out.println(names);














    }
}

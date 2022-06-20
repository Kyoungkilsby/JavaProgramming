package day23_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        String []arr={"A","B","C","D"};

        ArrayList<String>list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("_______________________");

        ArrayList<String>list2= new ArrayList<>(Arrays.asList("JAva","Python","C#"));

        String[] languages = list2.toArray(new String[0]);//String[list2.size()]
        System.out.println(Arrays.toString(languages));


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Integer[] n= nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));




    }
}

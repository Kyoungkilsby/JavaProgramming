package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[]array= new int[5];

        array[0]=10;
        array[2]=10;
        array[3]=10;
        array[4]=10;
        array[1]=10;
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());



    }
}

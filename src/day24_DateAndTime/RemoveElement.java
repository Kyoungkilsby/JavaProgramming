package day24_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {



        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,4,56,78,9,1,2,5,2,1,2));
        list.removeIf(p-> p>4);
        System.out.println(list);
    }
}

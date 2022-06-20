package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        int max= Collections.max(list);//unboxing
        int min = Collections.min(list);
        System.out.println("Max =" +max);
        System.out.println("Min = " +min);

        ArrayList<String > items = new ArrayList<>();

        items.addAll(Arrays.asList("Egg","Milk","soap","Paper","Potato","Apple"));

        Collections.sort(items);//ascending
        System.out.println(items);

        Collections.reverse(items);
        System.out.println(items);

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("kim","Lee","Park","Min"));
        System.out.println(students);

        Collections.swap(students,0,2);
        System.out.println(students);

        Collections.swap(students,0,students.size()-1);
        System.out.println(students);


    }
}

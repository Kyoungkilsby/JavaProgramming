package day24_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<String> names  = new ArrayList<>();

        names.addAll(Arrays.asList("Java","java","C#","Ruby","Swift","Java"));

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equalsIgnoreCase("java")){
                names.set(i,"Phyton");
            }
        }
        System.out.println(names);
        System.out.println("_______________________");

        System.out.println(names);

        Collections.replaceAll(names,"Java","Python");

        System.out.println(names);



        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100,50,50,50,40));

       int count = Collections.frequency(list,50);

        System.out.println(count);


        ArrayList<String> word= new ArrayList<>();
        word.addAll(Arrays.asList("Java","Java","c3","Java","c#"));

        int count2= Collections.frequency(word,"Java");
        System.out.println(count2);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,50,60,20,30,10,60,40));

        for (Integer each : numbers) {
            if(Collections.frequency(numbers,each) ==1){
                System.out.println(each);
            }

        }
    }
}

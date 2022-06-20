package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BulkOperations {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);

        System.out.println(list1);
        System.out.println("___________________________________");

        ArrayList<Integer> scores = new ArrayList<>();
        //scores.addAll(75,85,95,80,70);

        scores.addAll(Arrays.asList(75,85,95,70,80));
        System.out.println(scores);

        ArrayList<String>students = new ArrayList<>();

        students.addAll(Arrays.asList("kim","Soom","Dee","Aqq"));
        System.out.println(students);

        students.addAll(2,Arrays.asList("SOON","Bim"));
        System.out.println(students);

        Integer[]nums= {1,2,3,4,5,6,7,8};//non Primitive

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        //l1.addAll(Arrays.asList(nums))
        System.out.println(l1);

        ArrayList<String>developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Kim","Lee","Kim","Park","Sun","Min"));

        developers.retainAll(Arrays.asList("Kim","Lee","Park"));

        System.out.println(developers);

        ArrayList<String>groceriesList =new ArrayList<>();

        groceriesList.addAll(
                Arrays.asList("egg","soap","milk","Orange",
                        "Rice","ToMato","BlueBerry"));
       groceriesList.retainAll(Arrays.asList("egg","Rice"));
      //  groceriesList.removeAll(Arrays.asList("ToMato","milk");

        System.out.println(groceriesList);











    }
}

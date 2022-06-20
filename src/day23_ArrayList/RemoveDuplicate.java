package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();

        names.add("Kim");
        names.add("Kim");
        names.add("LEE");
        names.add("LEE");
        names.add("JIn");//4
        names.add("LEE");
        names.add("Kim");
        names.add("LEE");
        names.add("Soo");//8

        ArrayList<String>nonDup = new ArrayList<>();

        for (String each : names) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);

        }

       // names= nonDup;
        System.out.println(names);//[Kim, Kim, LEE, LEE, JIn, LEE, Kim, LEE, Soo]

        System.out.println(nonDup);//[Kim, LEE, JIn, Soo]


        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(list1==list2);

        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>();

        l1.add(10);
        l2.add(10);
        System.out.println(l1);//[10]
        System.out.println(l2);//[]
        System.out.println(l1==l2);// false
        System.out.println(l1.equals(l2));

        ArrayList<Integer>n1= new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer>n2= new ArrayList<>();

        n2.add(30);
        n2.add(20);
        n2.add(10);
        System.out.println("n1 =  "+n1);
        System.out.println("n2 =  "+n2);

        System.out.println(n1.equals(n2));//false

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());






    }
}

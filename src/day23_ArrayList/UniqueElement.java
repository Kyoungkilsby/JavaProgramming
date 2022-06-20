package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElement {

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

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasLee = names.contains("LEE");
        System.out.println(hasLee);//true
        System.out.println(hasMuhtar);//false


        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each)){
                System.out.println(each);
            }

        }
    }
}

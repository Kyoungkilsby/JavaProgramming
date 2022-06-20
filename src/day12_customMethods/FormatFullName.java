package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String first =input.nextLine().trim().replace(" ","");

        System.out.println("Enter your last mane");

        String last = input.nextLine().trim().replace(" ","");


        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
           //getting first character of first mane + the remaining characters of the first mane

        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String full_name = first +"  " + last;
        System.out.println(full_name);

      input.close();






       /* Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String s1= input.nextLine();

        System.out.println("Enter your last name");

        String s2 = input.nextLine();

        System.out.println(s1+" " +s2);    */






    }
}

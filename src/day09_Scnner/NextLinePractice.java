package day09_Scnner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");//Abe Middle +Enter
        String full_name = input.nextLine();
        
       // input.nextLine();// no need Because nextLine can read all!!
                            //nothing in the Scanner

        System.out.println("Enter your school name");
        String school_name =input.nextLine();

        System.out.println( "Enter your gender");
        String gender = input.next(); // next can not read "Enter"so enter go to scanner space

        System.out.println("Enter your age");
        int age = input.nextInt(); //Int can not read "Enter"so enter go to scanner space

         input.nextLine();// We have to give extra nextLine()Method
                          // after the other methods of scanner

        System.out.println("Enter your street name");
        String street = input.nextLine();


/* next line*/
input.close();

    }
}

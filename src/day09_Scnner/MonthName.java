package day09_Scnner;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int  num = input.nextInt();


        String result = (num ==1) ? "January" :(num==2)? "Tuesday":(num==3)?"Wednesday":
                (num==4)?"Thursday" :(num ==5)? "Friday": (num ==6)? "Saturday":"sunday";
        }









    }



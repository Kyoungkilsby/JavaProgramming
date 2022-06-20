package day09_Scnner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch =input.next().charAt(0);
        System.out.println("YOu have entered  "+ ch );

        System.out.println("would you like to continue?");

        //String answer = input.nextLine();
        String answer = input.next();

        input.close();



      //  System.out.println("You have entered :  "+answer);

    }
}

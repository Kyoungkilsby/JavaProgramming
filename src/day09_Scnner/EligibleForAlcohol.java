package day09_Scnner;

import java.util.Scanner;

public class EligibleForAlcohol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");

        int num =input.nextInt();
                if(num>=21){
                    System.out.println("Eligible");
                }else{
                    System.out.println("Not eligible");
                }


    }
}

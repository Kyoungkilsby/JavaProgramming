package day09_Scnner;

import java.util.Scanner;

public class NextLine_VS_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age =input.nextInt();

        input.nextLine();

        System.out.println("Enter your Full name");
        String Full_name =input.nextLine();
        System.out.println("age = "+age);
        System.out.println("Full-name ="+Full_name);





    }
}

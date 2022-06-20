package day09_Scnner;
import java.util.Scanner;
//import java.util.*;
public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//reading the key word //for reading user inputs
                        //Scanner input =new Scanner(System.in)

        System.out.println("Enter your first  number : ");

        byte num1 = input.nextByte();//-127 ~127
        System.out.println( " Enter your second number ; ");
        short num2 =input.nextShort();
        System.out.println( "Enter your third number : ");
        int num3 = input.nextInt();
        System.out.println( "Enter your fourth number :");
        long num4 = input.nextLong();

        input.close();
        int num5 = input.nextInt();



        System.out.println("First number : " +num1);
        System.out.println( "Second number : " + num2);
        System.out.println( "Third number : "+ num3);
        System.out.println(" Fourth number : "+ num4);


    }


}

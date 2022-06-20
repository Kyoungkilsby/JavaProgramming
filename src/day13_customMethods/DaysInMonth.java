package day13_customMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if ( month <0  || month >12){
            System.out.println("Invalid");
            return;//end the main Method
        }

        switch (month){

            case 2 :
                System.out.println("28days");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("30days");
                break;

            default:
                System.out.println("31days");

        }


        //(month==1)? "Ja" : (month ==2)? "Fa" :


    }
}

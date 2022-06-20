package day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_memo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type your name");
        String userName = input.nextLine();

        char[] name = userName.toCharArray();

        for (int i = name.length - 1; i >= 0; i--) {

            for (int j = 0; j < name.length; j++) {


            }


        }
        System.out.println(name);

        input.close();

    }}

      /*  char [] userName = new char[]{charArray};
        int[] count ={1,2,3,4,5};
        for (int j = 0; j < charArray.length; j++) {
            System.out.println(charArray,count);

        }


      }}












      // System.out.println(Arrays.toString(userName));




*/

      /*  String[] myGroup= new String[5];
        myGroup[0] ="Gulcin";
        //myGroup[4] = "Arsel";
        myGroup[myGroup.length-1]="Aseel";
        myGroup[2]= "Sumeve";
        myGroup[3]= "Sook";
        myGroup[1]="Min";
        myGroup[3]="Kyoung";


        System.out.println(Arrays.toString(myGroup));

        for (int i = myGroup.length-1; i >=0 ; i--) {//i=4 myGroup.length-1
            System.out.println(myGroup[i]);
        }









    }
}*/

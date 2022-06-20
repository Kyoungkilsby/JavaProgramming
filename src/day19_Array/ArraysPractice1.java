package day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup= new String[5];
        myGroup[0] ="Gulcin";
        //myGroup[4] = "Arsel";
        myGroup[myGroup.length-1]="Aseel";
        myGroup[2]= "Sumeve";
        myGroup[3]= "Sook";
        myGroup[1]="Min";
        myGroup[4]="Kyoung";


        System.out.println(Arrays.toString(myGroup));

        for (int i = myGroup.length-1; i >=0 ; i--) {//i=4 myGroup.length-1
            System.out.println(myGroup[i]);
        }

       int[] number = new int[100];



    }
}

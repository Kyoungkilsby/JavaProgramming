package day19_Array;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0, j =1;  i < number.length; i++,j++) {
          number[i]=j;
        }
        System.out.println("number = " + Arrays.toString(number));
        System.out.println("____________1____________");
        int[] arr1 = new int[100];
/*
        for (int i = 0,j=1; i < arr1.length; i++,j++) {
            arr1[i]=j;
        }*/

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= i+1;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        int[]arr3=new int[100];
        for (int i = 0,j=10; i < arr3.length; i++,j+=10) {
            arr3[i]=j;

        }
        System.out.println("arr3 "+ Arrays.toString(arr3));

        System.out.println("_______3______");



        int[]arr2= new int[100];//index 0-99
        for (int i = 0,j=100; i <arr2.length ; i++,j--) {
            arr2[i] = j;
        }
        System.out.println("arr2= "+Arrays.toString(arr2));

        int[]arr4=new int[100];//without  "j "
        for (int i = 0; i <arr4.length ; i++) {
            arr4[i]=100-i;}
            System.out.println(" arr4 = " +Arrays.toString(arr4));



}
}







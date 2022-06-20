package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1={10,20,30};
        int[] arr2={40,50,60,70,80};
        int[] arr3 ={90,100};
        int[] arr4= {1000,2000};
        System.out.println("_________");

        // index number   0  1  2      0  1  2  3  4   1   2
        int[][]arr2D = { {10,20,30}, {40,50,60,70,80},{90,100}};
        //index number       0              1             2
        // multidimensional array is a container for single dimensional Arrays not elements.

        System.out.println(arr2D.length);//3 one dimensional array


        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D));
        System.out.println(arr2D[2][0]);//we don't want to array
                           //we just want element//90
        System.out.println(arr2D[1][2]);//60






    }


}

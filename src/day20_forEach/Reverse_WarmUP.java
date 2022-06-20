package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse_WarmUP {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            // through the array name after he called already name,
            // you will use square bracket and you will pass this i.

            reverse[j] = array[i];

        }
        System.out.println(Arrays.toString(reverse));
        System.out.println("+++++++++++++++");
       /* int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] reverse1 = new int[array.length];

        int k = 0;

        for (int i = array1.length - 1; i >= 0; i--) {
            reverse1[k++] = array[i];

        }
        System.out.println(Arrays.toString(reverse1));*/

        int[] nums = {100,200,300,400,500};
       nums =ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        double [] a1={1.1,2.2,3.3};
       a1= ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));


    }

}


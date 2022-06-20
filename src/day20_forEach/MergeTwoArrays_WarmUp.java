package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;//you have to import

public class MergeTwoArrays_WarmUp {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        //make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
            System.out.println(Arrays.toString(arr3));
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];

        }
        System.out.println(Arrays.toString(arr3));

        int[]a1={10,20,30,40,50};
        int[]a2={60,70,80};
        int[]a3=ArraysUtility.merge(a1,a2);//merge method

        System.out.println(Arrays.toString(a3));

        int[]q1={1,23,5};
        int[]q2={2,3};
        int[]q3=ArraysUtility.merge(q1,q2);
        System.out.println(Arrays.toString(q3));

        double[] b1={1.2,3.4,5.5};
        double[] b2={5.2,5.6,};
        double[] b3=ArraysUtility.merge(b1,b2);

        System.out.println(Arrays.toString(b3));

        char[] ch1={'A','B','C','D'};
        char[]ch2  ={'v','w'};
        char[]ch3 =ArraysUtility.merge(ch1,ch2);

        System.out.println("ch3 = " +Arrays.toString( ch3));

        String []str1= {"apple","Baby","Car"};
        String []str2 = {"zoo","water","moon"};
        String []str3=ArraysUtility.merge(str1,str2);

        System.out.println(Arrays.toString(str3));

    }
}

package day19_Array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int[]arr1={10,20,30,40,50};//one object can be shared by multiple variables
                                    // for reference variables.
        int[]arr2=arr1;             //arr1,arr2,arr3 are in the stack
        int[]arr3=arr2;             //the object(10.20.30.40.50) are in the heap

        arr1[0]=1000;//change arr1,2,3
        arr2[2]=3000;//change arr1,2,3
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("____________________________");

        String [] a1 ={"Umran","Mehmet"};
        a1= new String[]{"Kyoung", "Sook"};
        System.out.println(Arrays.toString(a1));



    }
}

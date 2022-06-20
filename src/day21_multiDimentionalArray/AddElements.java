package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[]array= {1,2,3,4,5};
        int element = 6;

        //int[]new_array= new int[array.length+1];

        int[]new_array = Arrays.copyOf(array,array.length+1);//1,2,3,4,5,6

        new_array[new_array.length-1]= element;//add 6

        System.out.println(Arrays.toString(new_array));

        int[]numbers= {100,90,80,70,60};
        System.out.println(Arrays.toString(numbers));

        numbers= ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));

        double[] nums={1.5,2.5,3.5,4.5};

        nums= ArraysUtility.addElement(nums,5.5);

        nums= ArraysUtility.addElement(nums,6.5);

        nums= ArraysUtility.addElement(nums,7.5);

        System.out.println(Arrays.toString(nums));

        String[] str ={ "A","B"};
        str= ArraysUtility.addElement(str,"D");
        System.out.println(Arrays.toString(str));

        String[] names= {"Kim","Wang","Lee"};
        names= ArraysUtility.addElement(names,"Park");
        names= ArraysUtility.addElement(names,"Hong");
        names= ArraysUtility.addElement(names,"Jung");
        System.out.println(Arrays.toString(names));



    }
}

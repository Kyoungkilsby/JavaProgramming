package day19_Array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {
        int[] number = new int[5];
        int[] num = {10, 20, 30, 40, 50};//Array Literal
        System.out.println(number.length);
        System.out.println(num.length);
        System.out.println("number = " + Arrays.toString(number));
        System.out.println("num = " + Arrays.toString(num));
        System.out.println("_______________");
             //element:    1       2     3      4       5        6        7
        String[] days = {"Mon", "Tue",  "Wed", "Thur",  "fri", "sat", "Sun"};
        //index:            0      1      2       3       4        5       6
        int n = 7;

        System.out.println("days = " + days[n - 1]);//index number start o that's why -1


        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(Arrays.toString(month));


        for (int i = month.length - 1; i >= 0; i--) {
                  //last index
            System.out.print(" "+month[i]);
    }
}
}
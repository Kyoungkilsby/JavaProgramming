package day19_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         /*
         hen you use the new keyword to create this object,
          where do you think this object, will allocate into that right now,
          it is in the heap right.
          Even a scanner object every single object, they will be live
          in the heap memory so even the scanner object,
          yes, it will allocate in the heap.

          */
        System.out.println("How many number do you want to enter");
        int total=input.nextInt();

        int[]numbers= new int[total];//total user input//Array
        //if user put 3 then total is 3 =new int[3]
        int sum= 0 ;



        for (int i = 0; i <total ; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();//print user's input
            sum += numbers[i];
        }
        double average = sum/(double)total;
       DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


         input.close();
    }
}

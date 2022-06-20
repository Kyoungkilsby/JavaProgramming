package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers_WarmUp {
    public static void main(String[] args) {

        int[]numbers = {1,2,3,4,5,6,7,8,9,10};//size of Array is fix always
                                              // but not immutable
        for (int i = 0; i < numbers.length; i++) {
         /*  if(numbers[i] %2 !=0) {
               numbers[i] = numbers[i] * 2;
           }*/

           if(numbers [i]%2 ==0){
              continue;
          }
            numbers[i] =numbers[i] * 2 ;//all the number multiply
        }


        System.out.println(Arrays.toString(numbers));
}}
/* write a program that can multiply each odd number of an integer array by 2
        ex:
        array = [1,2,3,4,5];

        o,utput:
        ,array =[2,2,6,4,10]*/
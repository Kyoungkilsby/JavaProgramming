package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(score));
        String result = Arrays.toString(score);
        System.out.println(result);

        int [] a1={1,2,3,4,5};
        int[]a2={1,2,3,4,5};
       boolean r1= Arrays.equals(a1,a2);//true// elements and order are same.

        System.out.println(r1);
        char []ch1= {'a','b','c'};
        char []ch2= {'a','c','b'};
        boolean r2 = Arrays.equals(ch1,ch2)   ;
        System.out.println(r2);//false// the order is not same

        String[]s1= {"A","B","C"};
        String[]s2= {"A","C","B"};

        System.out.println(Arrays.equals(s1,s2));//false order is not same
        System.out.println("______________");

        int[]nums ={100,80,90,75,88,99,8,4,1000,560};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);//assign?[4, 8, 75, 80, 88, 90, 99, 100, 560, 1000]
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum Number is "+nums[0]);
        System.out.println("Maximum Number is  "+nums[nums.length-1]);

        String[]b1= {"C","B","A"};
        String[]b2= {"A","C","B"};
        Arrays.sort(b1);//same element but different order first sort methods
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1,b2));//true

        System.out.println("+++++++++++++++++++++");

        String[]students1 ={"Kim","Sook","Ray","Betty"};

        System.out.println(Arrays.toString(students1));
                Arrays.sort(students1);
        System.out.println(Arrays.toString(students1));

        System.out.println("_____________________");

        int[]array ={10,20,30,40,50,60,70};
        int[]array2= Arrays.copyOf(array,10);
        //if newlength :4 just 4 copy{10,20,30,40}
        //if newlength ;10 {10,20,30,40,50,60,70,0,0,0,}

        System.out.println(Arrays.toString(array2));

        int[]n1 = {1,2,3,4,5};
        int[]n2 ={6,7,8,9,10,11,12};//merge and get n3

        int[]n3 =Arrays.copyOf(n1,n1.length+n2.length);
        //instade use loop use copy of method so n3 has
        // n1+n2 length[1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0,j=n1.length; i < n2.length; i++,j++) {
            n3[j]=n2[i];
        }
        System.out.println(Arrays.toString(n3));

        char[]ch = {'A','B','C','D','F','G'};
        //           0    1   2   3   4   5
        char[]result1=Arrays.copyOf(ch,20);//start first element

        char[] result2=Arrays.copyOfRange(ch,3,5);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        /*
        if you do not want to copy it starting from first element
         copy starting from Third to the forth,
          element that are in the middle
          Then you will  used this copy of range method
        */






    }
}
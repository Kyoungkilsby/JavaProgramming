package day19_Array;

public class miniNumber {
    public static void main(String[] args) {

        int[]numbers= {100,20,500,40,-10,30};
        //index number  0   1   2  3   4   5
        int mini = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<mini){//compares the element of the array with current maximum number
             mini=numbers[i];//replace the current maximum number
            }
        }
        System.out.println("mini = " + mini);


    }

}

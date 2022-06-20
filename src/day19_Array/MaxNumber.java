package day19_Array;

public class MaxNumber {
    public static void main(String[] args) {

        int[]numbers= {100,20,500,40,-10,30};
        //index number  0   1   2  3   4   5
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){//compares the element of the array with current maximum number
                max=numbers[i];//replace the current maximum number
            }
        }
        System.out.println("max = " + max);

    }
}

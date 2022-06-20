package day22_arrayList;

public class Maximun_MiniMun_WarmUp {

    public static void main(String[] args) {
        // index of elements 0,  1   2    0  1    2     0  1  2
        int[][] array = {{100, 20, 300}, {10, 100, 50}, {-200, 400, 0}};//index0~2
        // index of 1DArray  0          1            2
          // length  3
        int max = array[0][0];
        int min = array[0][0];
        for (int[] each1D : array) {//single dimensional array

            for (int eachElement : each1D) {

                if(eachElement>max){
                    max= eachElement;
                }
                if(eachElement<min){
                    min= eachElement;
                }
            }
        }
        System.out.println("Maximum number is : "+ max);
        System.out.println("Minimum number is : "+ min);

    }
}
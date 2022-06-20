package day19_Array;
import java.util.Arrays;//I can call the toString Method
public class ArraysIntro {
    public static void main(String[] args) {
        int score1 =95 ;
        int score2 =98 ;
        int score3 =92 ;
        int score4 =94 ;
        int score5 =95 ;
     //  int[]scores = new int[0];// 0 ;can not contain any data
        int[] scores = new int[5];//5 element index: 0~4
        scores[2] = 87;
        scores[0] =85;
        scores[4] =99;
        scores[1] = 100;
        scores[3] =92;
        /* scores[5]= 22;
         scores[-1] =33;
       scores= new int[10];
        scores = new int[30];*/

        System.out.println(Arrays.toString(scores));
        for (int i = 0; i < scores.length; i++) {//length is variable
            System.out.println(scores[i]);

        }



    }
}

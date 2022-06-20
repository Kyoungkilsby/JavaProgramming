package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {
            System.out.println("Hello " + i);//it is print Hello 1 to Hello 6
        }

        int j=0;
        while (j < 5) {
            System.out.println("Hello"+ j);
            j++;
        }

        int k =0;

        do{
            System.out.println("Hello "+k);
            k++;
        }while(k<5);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        while(score>100 || score <0){
            System.out.println("Invalid score,please re-enter your score");
            score = input.nextInt();
        }

        if(score>=60) {
            System.out.println("pass");
        }else {
            System.out.println("fail");

        }




    }
}
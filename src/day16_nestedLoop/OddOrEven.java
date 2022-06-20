package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + "Even number");
            } else {
                System.out.println(number + "odd number");
            }
            System.out.println("Would you like to enter another number? yes/no");
            answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("No")) ){
                System.out.println("Invalid Entry!Would you like to enter another number? yes/no");
                answer=input.next().toLowerCase();
                break;
            }input.close();
         //   if(answer.equals("no")){ no need because this : while (answer.equals("yes"))
            //    break;
            }

        }




    }


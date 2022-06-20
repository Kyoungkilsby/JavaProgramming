package day09_Scnner;


import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//You can use several times ..
           //  new Scanner(System.in).nextInt()// only if use one time!!!
        System.out.println("Enter the day number");
        int num = input.nextInt();

        String day = "Invalid";

        if(num>=1 && num <=7){
            day = (num== 1)?"Monday":(num ==2)?"Tuesday":(num ==3)?"Wednesday"
                    :(num==4)? "Thursday" :(num ==5)?"Friday" :(num ==6)?"Saturday"
                    :"sunday";
        }
        System.out.println(day);

        input.close();



    }
}

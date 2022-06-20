package day08_Ternary_Switch;

public class TernariesIntro3 {

    public static void main(String[] args) {

        int score = 130;
        /*String result = "";

        if (score >= 0 && score <= 100) {//pre condition
            if (score >= 60) {
                result = "pass";
            }else {
                result = "Failed";
            }

        } else {
            result = "invaled";
        }

        System.out.println(result);

         */


        String result=(score >= 0 && score <=100)?
                (score>=60)?"Passed" :"Failed"

                : "Invalid Score";
        System.out.println(result);

        int  n =6;

        String day = (n>=1 && n<=7)?//pre condition
                (n==1)?"Monday":(n==2)?"Tuesday" :(n==3)? "Wednesday":(n==4)?"Thursday":
                        (n==5)?"Friday": (n==6)? "Saturday":"Sunday"

                :"No Such a day";
        System.out.println(day);






    }

}

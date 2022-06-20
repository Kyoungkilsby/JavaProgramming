package day08_Ternary_Switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {
        int score = 250;
      /*  String result;
        if (score >= 90 && score <= 100)
            result = "A";
        else if (score >= 80 && score < 90) {
            result = "B";
        } else if (score >= 70 && score < 80) {
            result = "c";
        } else if (score >= 60 && score < 70) {
            result = "D";
        } else{       //(score<60)//
            result = "F";
        }

        System.out.println(result);*/


        String result2 = "";
        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                result2 = "Pass";
            } else {
                result2 = "Failed";
            }

        } else {
            result2 = "Invailed";
        }

        System.out.println(result2);

        String result3 = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid Score";
        System.out.println(result3);

        int n = 9;
        String result4 = "";
        if (n >= 1 && n <= 7){
            if (n == 1) {
                result4 = "Monday";
            } else if (n == 2) {
                result4 = "Tuesday";
            } else if (n == 3) {
                result4 = "Wednesday";
            } else if (n == 4) {
                result4 = "Thursday";
            }   else if (n == 5) {
                result4 = "Friday";
            } else if (n == 6) {
                        result4 = "saturday";
                    } else {
                        result4 = "sunday";
                    }
                } else {
                    result4 ="Not a day";
                }

        System.out.println(result4);
        int m= 8;
       String day= ( m >= 1 && m <= 7)?
                (m==1)?" Monday":(m==2)? "Tuesday" :(m==3)? "Wednesday": (m==4)?"Thurday":
                        (m==5)?"Friday" : (m==6)? "Saturday":"Sunday"

                        : "not a Day";

        System.out.println(day);






            }
    }


















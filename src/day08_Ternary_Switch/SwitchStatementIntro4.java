package day08_Ternary_Switch;

public class SwitchStatementIntro4 {

    public static void main(String[] args) {

        int score = 250;
        String result;
        if (score >= 90 && score <= 100)
            result = "A";
        else if (score >= 80 && score < 90) {
            result = "B";
        } else if (score >= 70 && score < 80) {
            result = "c";
        } else if (score >= 60 && score < 70) {
            result = "D";
        } else {       //(score<60)//
            result = "F";
        }

        int m = 50 ;
        switch (m){

            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println( "C");
            case 60:
                System.out.println("d");
                break;

            case 50 :
                System.out.println("Failed");
                break;












        }






    }
}
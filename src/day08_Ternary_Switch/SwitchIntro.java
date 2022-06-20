package day08_Ternary_Switch;


public class SwitchIntro {

    public static void main(String[] args) {

      /*  cha grade ='A';


        switch (grade){
            case 'A':
                System.out.println("Execellent");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("pass");
                break;
            default:
                System.out.println("Failed");
                break;



        }
        System.out.println();*/

        char grade = 'A';
        String result = "";

        if (grade == 'A') {
            result = "Excelent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Pass";
        } else {
            result = "Failed";
        }
        System.out.println(result);
    }

}














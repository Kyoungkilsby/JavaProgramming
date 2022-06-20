package day08_Ternary_Switch;



public class TernariesIntro {
    public static void main(String[] args) {
        int score = 80;
        String result="";//result ;
        if (score >= 60) {
            result = "passed";
        } else {
            result = "failed";
        }
        System.out.println(result);


        String result2 =(score>=60)?"passed" : "failed";
        System.out.println(result2);

        int age = 34;
        String r="";

        if(age>=21){
            r ="Eligible";}
            else{
                r = "Not Eligible";}
        System.out.println(r);

        

   
    }
}

package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(10.5,22);
        System.out.println("__________________");

        maxNum(12500,5452);
        System.out.println("___________________");

        maxNum(-125,-45);
        System.out.println("_______________________");

        initial("kyoung" ,"Kilsby");


    }

    public static void maxNum(double num1,double num2){

        if (num1 > num2) {
            System.out.println(num1 + "is the maximum number");
        }else if (num1< num2){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }
    }
    //Creat a method that can display the initials of a person(firstName, lastName)
    public static void initial(String firstName, String lastName){
        //(int age,char gender,String hairColor ,String address)

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
    }






}

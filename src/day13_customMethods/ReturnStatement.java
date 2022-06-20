package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {

        System.out.println("Test start");

        boolean exit=true;
        if(exit){
            return;//main method gets terminated
        }

        System.out.println("Test2");//can not print because " return "


        eligible(56);

      int a = mutiplcation(12,23);
        System.out.println(a);
        System.out.println(mutiplcation(12,23));



    }

    public static void eligible (int age){

        if (age < 0 || age > 150) {
            System.err.println("invalid age;  "+age);
            return;//exits the method
            //If the age is invalid, then the this gets terminated
        }
        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }


    }


    public static int mutiplcation(int n1, int n2){

        int result = n1*n2;

        return result;
    }

}

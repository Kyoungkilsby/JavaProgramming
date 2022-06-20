package day13_customMethods;

public class Method {
    public static void main(String[] args) {

        System.out.println(isOdd(11));
        System.out.println(isEven(44));

       boolean  a = isEven(56);
        System.out.println(a);
        System.out.println(max(12,12));

    }

    public static boolean isOdd(int num) {

        return (num % 2 != 0) ? true : false;


    }

    public static boolean isEven(int num) {

         return !isOdd(num);

      /*  if (num % 2 == 0) {
            return true;
        }
        {
            return false;
        }*/

    }

    public static int max(int num1, int num2){

        return (num1 > num2) ? num1 : num2;

        /*if(num1> num2){
        return num1;
        } else {
        return num2;
        }
         */


       /* mine
        return (num1 > num2) ? "num1 is Maximum"
                :(num1<num2) ?"num2 is Maximum"
                :"Equal";

                */

    }
}



package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {

            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("______________");
        for (int i = 10; i < 20; i++) {

            if (i % 2 == 0) {//i is even
                continue;
            }
            System.out.println(i);

        }

        for (char i = 'A'; i <= 'G'; i++) {
            if (i == 'B' || i == 'E') {

                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            System.out.println("Hello Cydeo1");

        }

        //find the sum of all the even number between 50~100

        for (int i = 50; i < 101; i++) {
            if(i %2==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();

            //50,52,54,....100
        for (int i = 50; i < 101; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println();

        for (int i = 50; i <101 ; i++) {
            if(i %2 !=0){
                continue;
            }
            System.out.print(i+ " ");
        }


    }
}

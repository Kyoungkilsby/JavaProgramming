package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }


        for (char j = 'A'; j <= 'Z'; j++) {


            if (j == 'K') {

                System.out.println("Loop is terminated");
                break;
            }

                System.out.println(j);

                System.out.println("___________________________");
                for (; ; ) {
                    System.out.println("Hello");
                    break;

                }


            }


        }

    }
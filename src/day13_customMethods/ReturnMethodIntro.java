package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        int total = sum(10, 20);//return Method can give data
        // put the data  put in varial total
        System.out.println(total);

        // int add1 = add(11,12);//add is a void method, does sdnot return any data
        // System.out.println(add1);

        int total1 = square(4);
        System.out.println(total1);
        System.out.println(square(4));

        System.out.println(cube(4));
        int c = cube(4);

        System.out.println(c);

    }

    public static int sum(int n1, int n2) {//
        int result = n1 + n2;
        return result;
    }

    public static int square(int num) {

        int square = num * num;

        return square;
    }


    public static int cube(int num) {

        int cube = square(num) * num; //num*num*num;
        return cube;
    }
}


    /* public static void add (int n3,int n4){


         int result1 = n3 + n4 ;
            System.out.println(result1);

        }*/






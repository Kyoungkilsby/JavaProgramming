package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition = false;

        for(;condition;){
            System.out.println("Hello");//no print
        }


        while (condition){
            System.out.println("No print");
        }


        do {
            System.out.println("It can be Print ");
        }while(condition);


    }
}

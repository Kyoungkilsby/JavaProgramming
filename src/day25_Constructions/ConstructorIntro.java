package day25_Constructions;

public class ConstructorIntro {


public  ConstructorIntro(){
    System.out.println("Object is created by using default constructor");
}

    public ConstructorIntro(int a){
        System.out.println("Object is created by using default constructor");

    }

    public static void main(String[] args) {

         ConstructorIntro obj1 = new ConstructorIntro(10);//nothing will execute
        ConstructorIntro obj2= new ConstructorIntro(10);
       // ConstructorIntro obj3= new ConstructorIntro("java");



    }
}

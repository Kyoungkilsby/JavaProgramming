package day18_garbageCollection;

import day17_Custom_Class_intro.Dog;

public class GarbageCollection {

    public static void main(String[] args) {
        String s1="Java";
        s1=null;//"Java" will be eligible for garbage collection
       // System.out.println(s1.toLowerCase());
        //System.out.println((s1.replace("null","full"));

        System.out.println(s1);

        System.out.println("__________________");
        String str1 = "Python";
        str1="Cydeo";
        System.out.println(str1);

        System.out.println("___________________");
        Dog dog1=new Dog();
        dog1.setInfo("Chuck","Chow ",'M',3,"Medium","Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chu","Chow ",'M',5,"Small","White");

        // dog1= null;
        dog1= dog2;
        System.out.println(dog1);
    }

}

package day18_garbageCollection;

public class MemoryAllocation {
    public static void main(String[] args) {
        int a =100;//a is local variable  a & 100 are located in the stack
      //  Car car= new Car();
        //stack     //heap

    }
    public static void method1(){
        int b = 200; // b & 200 are located in the stack
    }
    public static void method2(){
        String c= "hello world";//hello world is object so in heap
                                  // (inside a String pool)

         // c is local variable reference variable

        String d= new String("hello");
        //  stack         heap

    }
}

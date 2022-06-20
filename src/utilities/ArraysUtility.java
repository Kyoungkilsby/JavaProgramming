package utilities;

import day16_nestedLoop.FrequencyOfWord_WarmUp;

import java.util.Arrays;

public class ArraysUtility {//customMethod
           /*
 if I just create the method that can merge two integers on their this class
  whenever I need that method,
  I can just call it through this class.
   Am I going to use this class to create objects from it,
I just want to use this class to call the method,
that are included in this class, so the metals
that i'm going to create should I created as static or should they be instance.
If you do not need any objects, then you can  create them as static right,
 so what that means is that the next time when you need to call it
 through the class thing

     */

    /* I have a method that can merge to int array to return the third integer arrays
   next time if I have on other two integer array ,
 do i have to repeat  this cord fragments again for both other two injuries.
 no..I can call this method that can execute the same code fragments for me
 o the car race utility costs that you created by yourself, it is under the utilities package,
  it is in different package than the class that you are in right now.
0
What you need to do, you need to import the class first right so,
by the way, if I need to import this already utility class that I created by myself.

How should I write the impact statement by give import and then what
after an important you need to give the package, a package name is utilities right.

Under this package we have this class Allay utility
see I just important this arrays  utility class that I created by myself under the utitly  package.

And once you've imported it.throw the class name.

throw this orange to delete this class name through this class name, you can call them at boat merge.

 */
    public static int[] merge(int[] arr1, int[] arr2) {//return method

        int[] arr3 = new int[arr1.length + arr2.length];
        //make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];

        }
        return arr3;

    }

    public static double[] merge(double[] arr1, double[] arr2) {//return method

        double[] arr3 = new double[arr1.length + arr2.length];
        //make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;//for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {

            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];

        }
        return arr3;

    }

    public static char[] merge(char[] arr1, char[] arr2) {//return method

        char[] arr3 = new char[arr1.length + arr2.length];
        //make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];

        }
        return arr3;

    }

    public static String[] merge(String[] arr1, String[] arr2) {//return method

        String[] arr3 = new String[arr1.length + arr2.length];
        //make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];

        }
        return arr3;

    }


    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse; /* this method at the end you need to return
        an String array So what do I need to return  at the end from this method,
        I need to return this arry reverse.
         you just group this these called fragments within this method and then returned the array
         that you got at the end.*/
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }


    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    //{1,2,3,4}      2
    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;

    }

    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;

    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;

    }
    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals( element)) {
                return true;
            }
        }
        return false;

    }


 /*   public static int[]remove (int[]  array,int index){

    }

    public static int[]reMoveDup(int[] array){


    }*/


}





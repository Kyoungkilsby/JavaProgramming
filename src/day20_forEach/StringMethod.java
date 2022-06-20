package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {


        String str="Cydeo School";

        char []ch=str.replace(" ","").toCharArray();//all character //no argument
/*So if you want to get every single character and store them into a data structure
from a string than to char Array method is the best choice for you to use
from the string methods okay so from the string if you just call this method to char Array.
 this is the method that is an instance methods in the string class
 that's why you can call it string.
 */
        System.out.println(Arrays.toString(ch));
        System.out.println("__________________________-");

        String str2="Today is a great day to learn java";


        String []word1 = str2.split("great");//[Today is a ,  day to learn java]/
        System.out.println(Arrays.toString(word1));

        String []word = str2.split(" ");
        System.out.println(Arrays.toString(word));
        System.out.println("+++++++++++++++++++++++++++++");

        String sentence= "I love java";
      //  String []s2= sentence.split("");//[I,  , l, o, v, e,  , j, a, v, a]


      String[] arr = ArraysUtility.reverse(sentence.split(" "));//[java, love, I]
        System.out.println(Arrays.toString(arr));
        String reverseSentence="";//just String out " Java love I"

        for (int i = 0; i < arr.length; i++) {
            reverseSentence += arr[i]+" ";//
            
        }
        System.out.println(reverseSentence);
            
        }


      //  char[]ca1=str2.replace(" ", "").toCharArray();
       // System.out.println(Arrays.toString(ca1));


    }





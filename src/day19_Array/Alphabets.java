package day19_Array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[]ascending =new char[26];//index 0-25
        char[]descending = new char[26];
        for (int i = 0,j='A',k='Z'; i < ascending.length; i++, j++,k--) {
            ascending[i]=(char)j;//j is int so you have to convert to char
            descending[i]=(char) k;//you have to explicit casting
            /* So you  cast it to the char now  this number "j"
               is  just going to convert to the  chart and
                chart will be assigned it to the index of this element.
              */
        } System.out.println("ascending = " + Arrays.toString(ascending));
        System.out.println("descending = " +Arrays.toString(descending));

        char[]characters=new char[65535];//put all the char characters

        for (int i = 0; i < characters.length; i++) {
            characters[i]= (char)i;

        }
        System.out.println("characters = " +Arrays.toString(characters));

    }
}

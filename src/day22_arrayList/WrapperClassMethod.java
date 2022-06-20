package day22_arrayList;

import java.util.Arrays;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);//201 because 20 is text

        Integer num1 = Integer.parseInt(str);//unboxing
        int num = Integer.parseInt(str);
        System.out.println(num + 1);

        Integer num2 = Integer.valueOf(str);

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        double num4 = Double.valueOf(s);

        System.out.println(num3 + 1);
        System.out.println(num4 + 1);

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        char ch = '$';

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("IsSpecialChar =" + isSpecialChar);


        System.out.println("_________________");
        String string = "a1b2c3d4e5";

        int sum = 0;
        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);

            }
            System.out.println(sum);


                /* how can you convert a char to a number,like digit
                //simple from Integer wrapper class,
                // you can call the parse method.
                //And when you call this parse method it only accepts string,
                // but you have a chair right now is there a way that
                I can convert this chart to the string,
                then I can use this parse method to convert that string
                to the digital //The easiest way to convert anything to the string
                is simply by comcating it to an empty string.
                So now, if the character is digital, //if(Character.isDigit(each)
                then we can convert that character to the number,
                if the characters is 2 two
                But I don't want that number,
                I just want this 2 as a number to be added to the sum.
                 that's why I use this parse method which can help me to convert this
                character after it's gone string it this parse method is going to
                convert that string to a number once it is converted to the number that I
                get added to this sum.


                 */


        }

    }
    }


package day17_Custom_Class_intro;

public class Unique_Characters2_WarmUp {//find the unique Character from String
    public static void main(String[] args) {
        String str="aabcccd";

        String unique = "";//bd
        for (int j = 0; j <str.length() ; j++) {//repeat this statement every character

            char ch = str.charAt(j);//'a' compare with other character
            int frequency = 0;//I don't know many times the first character appear
            for (int i = 0; i < str.length(); i++) {//checks how many times the ch has appeared in str
                if (str.charAt(i) == ch) {//if the ch has appeared in the string
                    frequency++;//increase the frequency by 1
                }
            }
            if (frequency == 1) {//if the frequency is one, then it's unique//if you want to find 3time change ==3//
                unique += ch;

                System.err.println(unique);//b bd
            }
        }
        System.out.println(unique);//bd




    }
}

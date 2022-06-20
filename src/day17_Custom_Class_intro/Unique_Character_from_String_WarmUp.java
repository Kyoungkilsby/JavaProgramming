package day17_Custom_Class_intro;

public class Unique_Character_from_String_WarmUp {//unique :only one time appear in string
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique="";

        for (int i = 0; i <str.length() ; i++) {//i : index numbers of str
            char each =str.charAt(i);
            if(str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;
            }
            System.out.println(unique);//bbbb bd

        }System.err.println(unique);//bd

    }
}

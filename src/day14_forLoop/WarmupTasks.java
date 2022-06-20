package day14_forLoop;

public class WarmupTasks {
    public static void main(String[] args) {

        String str3 = combine("Java","apple");
        System.out.println(str3);

    }

    public static String combine(String str1 , String str2){

        String result ;

        if(str1.endsWith("" + str2.charAt(0))){//if the first string ends with the first letter of
                   result= str1 + str2.substring(1);           // sencond string

        }else{
            result = str1 +str2;
        }

        return result;




    }
}

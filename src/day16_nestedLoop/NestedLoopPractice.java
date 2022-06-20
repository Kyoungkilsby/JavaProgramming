package day16_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {


        String str= "aaaabbccddeff";

        String result =""; //
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//each character of str
            int count =0 ;//frequency
            for (int i= 0; i <str.length() ; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if(count==2 && !result.contains(""+ch)){
                result +=ch;

                //System.out.println(result);// b   bc   bcd    bcdf
            }

        }
       System.out.println(result);//bcdf








            }


        }







        




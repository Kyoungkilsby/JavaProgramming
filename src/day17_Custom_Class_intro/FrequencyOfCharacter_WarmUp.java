package day17_Custom_Class_intro;

public class FrequencyOfCharacter_WarmUp {

    public static void main(String[] args) {
        String str = "aabcccdddeeeun;byyyyyyd";

        String result = "";//a2b1c3d1
                          // a b c d
                          // 2 1 3 1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//'a' compare with other character
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;

                }

                }
            if(result.contains((""+ch))){//if the character is already included in the result
                continue;//Skip the character


            }

            System.out.println(ch + "  :  " + count);//a : 2
            result += ch+""+count;
        }
        System.out.println(result);

    }
}
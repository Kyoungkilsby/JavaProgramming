package day15_whileLoop;

public class  RemoveDulicates2 {
    public static void main(String[] args) {


        String str = "xyzxhwxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) {// if the charachter is already contained in new string
                continue;
            }

            result += str.charAt(i);

        }


            System.out.println(result);
        }

    }

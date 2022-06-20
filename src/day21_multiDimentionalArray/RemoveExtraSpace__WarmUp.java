package day21_multiDimentionalArray;

public class RemoveExtraSpace__WarmUp {
    public static void main(String[] args) {

      String  str ="Hello world     I    love   Java     ";

      String []words=str.split(" ");

        str="";

        for (String each : words) {
            if(!each.isEmpty()){
            str += each +" ";
        }

    }
        str=str.trim() ;
        System.out.println(str);

}
}
/*
  String  str ="Hello world     I    love   Java     ";
       // str= str.trim();
      //  System.out.println(str);//Hello world     I    love   Java

        String []words=str.split(" ");
       // System.out.println(Arrays.toString(words));
        //[Hello, world, , , , , I, , , , love, , , Java]

        str="";

        for (String each : words) {
            if(!each.isEmpty()){
            str += each +" ";
        }

    }//Hello world I love Java
        str=str.trim() ;
        System.out.println(str);
 */
/*
 Write a program that can remove all the extra space from string
            Ex:
                str = "  Hello world      I      love      Java    "

            Output:
                Hello world I love Java

 */
package day19_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {

           double n1=10.56789;
        DecimalFormat df =new DecimalFormat("0.0");

        System.out.println(df.format(n1));
    }
}

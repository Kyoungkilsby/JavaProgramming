package day21_multiDimentionalArray;

import javax.swing.*;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"James", "Han", "Shin", "Na"};
        String[] group2 = {"Jhon", "Bill", "Jin"};
        String[] group3 = {"San", "Kook"};
        String[] group4 = {"Song"};

        String[][] groups = {group1, group2, group3, group4};
        //index              0        1       2     3

        //mix for loop and for each Loop
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudents : eachGroup) {
                // for (int j = eachGroup.length - 1; j >= 0; j--) {
                // String eachStudents= eachGroup[j];
                System.out.println(eachStudents);

            }

        }


        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];//
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("__________________________-");
        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }

        }
        System.out.println(Arrays.deepToString(groups));//for multi dimensional arrays


    }


}

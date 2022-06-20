package day23_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement_WarmUp {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println(list);



        for (Integer element : list) {
          //  int element=1;
            int frequency =0;

            for (Integer each : list) {//for each loop can not access revere order
                // for each loop do not have access to index number only element itself.
                if (each == element) {
                    frequency++;
                }
            }
          //  System.out.println(frequency);//2 1 2 2 1 2 2 1
                            //                  2     4     6
            //if(frequency==1){
               // System.out.println(element);//2,4,6
              //  break;//exiting loop //2
            }
        }


            



    }


package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split of No Split? ( Yes or No)");
        String yesNo = input.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor");
        String service = input.next().toLowerCase();

        input.close();

        double totalTip = (service.equals("excellent"))?amount*0.25
                          :(service.equals("great"))?amount*0.20
                          :(service.equals("good"))? amount*0.15
                          :(service.equals("fair"))? amount*0.10
                          :amount*5;

        double totalpay = amount + totalTip;

        System.out.println("number of people ;  "+numberOfPeople);
        System.out.println( "Total to pay  :  " +totalpay);

        if(yesNo.equals("yes")){
            System.out.println("Total per person : "+ totalpay/numberOfPeople);
            System.out.println("Tip per people : "+ totalTip/numberOfPeople);
        }










    }
}


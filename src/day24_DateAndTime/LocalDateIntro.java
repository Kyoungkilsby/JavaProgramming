package day24_DateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today= LocalDate.now();
        System.out.println(today);

        LocalDate birthday= LocalDate.of(2000,5,23);
        System.out.println(birthday);
        System.out.println("---------------1----------");
        System.out.println(today.getYear());//2022

        System.out.println(today.getMonth());//JUNE

        System.out.println(today.getMonthValue());//6

        System.out.println(today.getDayOfWeek());//FRIDAY

        System.out.println(today.getDayOfMonth());//17

        System.out.println(today.getDayOfYear());//168

        today= today.plusYears(1);// 2022 I have to assign back . update .

        System.out.println(today);//2023-6-17
        System.out.println("__________________________");

        LocalDate graduationDate= LocalDate.of(2025,6,7);

        System.out.println(graduationDate);//2025-6-7

        graduationDate.plusYears(2);//2025-6-7

        System.out.println(graduationDate);//2025-6-7

        graduationDate= graduationDate.plusYears(2);//2027-6-7

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusMonths(7);//2027-6-7

        System.out.println(graduationDate);//2028-01-07

        graduationDate=graduationDate.plusWeeks(7);

        System.out.println(graduationDate);//2028-01-07

        graduationDate=graduationDate.plusDays(111);

        System.out.println(graduationDate);//2028-6-15

        System.out.println("______________________________");

        LocalDate YourBirthday = LocalDate.of(1973,6,23);

      LocalDate YourBrotherBirthDay= YourBirthday.minusYears(2).minusMonths(3).minusDays(22);

        System.out.println(YourBirthday);
        System.out.println(YourBrotherBirthDay);

        LocalDate birthday1= LocalDate.of(2002,2,23);
        LocalDate birthday2=LocalDate.of(2002,2,23);

        boolean r1= birthday1.equals(birthday2);
        System.out.println(r1);//true
        System.out.println("____________________________");


        LocalDate grad_date =LocalDate.of(2023,1,1);


        System.out.println(grad_date.isBefore(LocalDate.of(2022,5,5)));//false

        System.out.println(grad_date.isAfter(LocalDate.of(2022,5,5)));//true

        System.out.println(LocalDate.of(2022,6,17).isLeapYear());//false








    }
}

package day25_Constructions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {


        DateTimeFormatter df =DateTimeFormatter.ofPattern(" MMM/dd/y,E");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1= LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));

        DateTimeFormatter tf =DateTimeFormatter.ofPattern("HH:mm a");

         LocalTime time1 = LocalTime.of(13,5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("EEEE,MMM/dd/y");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));


        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("EEEE, H:mm a  MMM/dd/y");

        LocalDateTime s = LocalDateTime.of(2020,11,24,1,00);
        System.out.println(s.format(dtf1));

    }
}

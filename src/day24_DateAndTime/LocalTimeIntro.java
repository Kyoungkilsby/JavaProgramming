package day24_DateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime Starting_time =LocalTime.of(10,30);
        System.out.println(Starting_time);//10:30

        LocalTime right_now= LocalTime.now();

        System.out.println(right_now);//06:51:32.231533

        System.out.println("___________________");

        LocalTime time1 = LocalTime.of(23,59,59);
        System.out.println(time1);//23;59;59

       time1= time1.plusHours(1);

        System.out.println(time1);//00:59:59

        time1=time1.plusMinutes(45);

        System.out.println(time1);//01:44:59



    }
}

package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        do {

            System.out.println("Enter your user name");
            u = input.nextLine();
            System.out.println("Enter your password");
            p = input.nextLine();

        } while (!(u.equals("Cydeo") && p.equals("woodenSpoon")));//while the credentials are invalid

        input.close();
    }
}

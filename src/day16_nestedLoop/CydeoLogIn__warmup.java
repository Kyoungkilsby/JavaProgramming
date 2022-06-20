package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn__warmup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String u = input.next();

        System.out.println("Enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("woodenSpoon")) {
            System.out.println("Logged in");
        } else {  //otherwise
            for (int i = 0; i < 3; i++) {//i= 0,1,2
                if(i !=2) {
                    System.err.println("Incorrect username or incorrect password,please re-enter");
                } else {
                    System.out.println("This is your last attempt,Please re-enter your username and password");
                }

                System.err.println("Incorrect username or incorrect password,please re-enter");
                System.out.println("Enter your username");
                u = input.next();

                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("woodenSpoon")) {//if user enter valid credentials
                    System.out.println("Logged in");
                    break;//exits the loop
                }
            }

            if (!(u.equals("Cydeo") && p.equals("woodenSpoon"))) {
                System.err.println("your account is lock.Please contact service ");
            }
            input.close();

        }
      /*  public static void cydeoLogin(String username, String password){
            if(username.equals("Cyddo") && password.equals("WoodenSpoon"))
                System.out.println("You are logged in");
        }else{ // just one time not loop
            System.out.println("Invalid credentials");*/

           /* for (int i = 0; i < 3; i++) {//i= 0,1,2
                if(i !=2) {
                    System.err.println("Incorrect username or incorrect password,please re-enter");
                } else {
                    System.out.println("This is your last attempt,Please re-enter your username and password");
                }

                System.err.println("Incorrect username or incorrect password,please re-enter");
                System.out.println("Enter your username");
                u = input.next();

                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("woodenSpoon")) {//if user enter valid credentials
                    System.out.println("Logged in");
                    break;//exits the loop
                }
            }

            if (!(u.equals("Cydeo") && p.equals("woodenSpoon"))) {
                System.err.println("your account is lock.Please contact service ");
            }*////this is for loop
        }


    }




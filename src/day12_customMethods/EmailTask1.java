package day12_customMethods;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "cydeo_school@gmail.com";
                      // tyson_mike@gmail.com

        String firstName =email.substring(0,(email.indexOf("_")));
        System.out.println(firstName);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        System.out.println(lastName);

        String rest = email.substring(email.indexOf("@"));
        System.out.println(rest);

        System.out.println(lastName+"_"+ firstName+rest);







       /* Scanner input = new Scanner(System.in);

                System.out.println("Enter your first name");

                String first_name = input.nextLine();

                 System.out.println("Enter your last name");

                 String last_name = input.nextLine();

                 input.close();

        System.out.println( last_name + "_"+first_name+"@Gmail.com");

*/


    }

}

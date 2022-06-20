package day08_Ternary_Switch;

public class FiledTrip {

    public static void main(String[] args) {

        int grade = 1;
        String location = "unknowm";
        int numberOfGroup = 0;
        String teacher = "unknown";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroup = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroup = 7;
                teacher = "Mr. Lee";


            }


        }
        System.out.println(grade ==1);




     /* Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown*/


    }
}

package day26_Statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {
        Student student1= new Student("Kim",22,'F',"A1");
        Student student2= new Student("Lee",22,'F',"B1");
        Student student3= new Student("Park",22,'F',"C1");
        Student student4= new Student("Soon",22,'F',"D1");
        Student student5= new Student("Jin",22,'F',"E1");
        Student[]students={student2,student3,student4,student5};

        StudentsGroup group1= new StudentsGroup("Java Turtles",1);
        group1.addStudent(student1);
        group1.addStudents(students);
        group1.addStudent("Naa",55,'M',"F1");
        System.out.println(group1);

        group1.removeStudent("E1");
        System.out.println(group1);

        group1.removeStudent("D1");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+ "    :    "+ each.id);
        }

        Student student11= new Student("Kimm",22,'F',"AA1");
        Student student12= new Student("Leee",22,'F',"BB1");
        Student student13= new Student("Parkk",22,'F',"CC1");
        Student student14= new Student("Soonn",22,'F',"DD1");
        Student student15= new Student("Jinn",22,'F',"EE1");

        StudentsGroup group2 =new StudentsGroup("Eagle",2);

        Student[]students2={student11,student12,student13,student14,student15};
        group2.addStudents(students2);
        System.out.println(group2);
        System.out.println("_______________________________________________________");

        Student student21= new Student("KKim",22,'F',"AA11");
        Student student22= new Student("LLee",22,'F',"BB11");
        Student student23= new Student("PPark",22,'F',"CC11");
        Student student24= new Student("SSoon",22,'F',"DD11");
        Student student25= new Student("JJin",22,'F',"EE11");

        StudentsGroup group3 = new StudentsGroup("Whale",3);
        Student[]students3 ={student21,student22,student23,student24,student25};
        group3.addStudents(students3);
        group3.addStudent("Jhon",55,'M',"FF11");

        System.out.println(group3);

        System.out.println("_____________________________--");

        Student student31= new Student("Kim",22,'F',"A21");
        Student student32= new Student("Lee",22,'F',"B31");
        Student student33= new Student("Park",22,'F',"C41");
        Student student34= new Student("Soon",22,'F',"D51");
        Student student35= new Student("Jin",22,'F',"E61");

        StudentsGroup[]group4=new StudentsGroup("Moon",4);
        Student[]students4 =
        group4.dfhffdf










    }
}

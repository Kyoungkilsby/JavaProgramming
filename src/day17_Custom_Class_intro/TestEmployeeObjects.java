package day17_Custom_Class_intro;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        /*And again, in order to create object,
         you will always use the new keyword and then, once I create object,
         I want to be able to reuse it
        that's why I am going to store it into the object name called employee one.
           So, after the new keyword once you give the space,
            it is going to give you the option for the employee plus
            and once you hit the enter see object is created.
         */
        employee1.setInfo("Sumeye",28,'F',"Java Developer",95000,"A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Kyoung",48,'F',"Java Developer",98000,"B13");

        Employee employee3 = new Employee();
        employee3.setInfo("Lucy",33,'F',"Developer",99000,"C14");

        employee2.age = 39;//correct information

        employee1.name= "Kate";

        employee1.gender= 'F';


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();//employee 1 is working //print
    }


}

package day26_Statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentsGroup HAS A Student

    public String groupName;

    public int groupId;

    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        // students = new ArrayList<>();size :0
    }//creat the StudentsGroup object by setting the groupname and id

    public void addStudent(Student student) {
        students.add(student);
    }
    //take one student object and adds it to the arrayList of students

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));

    }

    public void addStudent(String name, int age, char gender, String id) {
        //  Student student = new Student(name, age,gender,id);
        students.add(new Student(name, age, gender, id));
    }//
    //takes name,age, gender, id of student info, creates student object by using the given info, then adds the student
    //object to the arrayList

    public void removeStudent(String id) {
        students.removeIf(p -> p.id.equals(id));
    }//take the id amd then removes the student object with the specified id
    // from arrayList of student

    @Override
    public String toString() {
        return "day26_Statics.studentTask.StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size()+
                '}';
    }
}





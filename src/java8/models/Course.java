package java8.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 7/11/2018.
 */
public class Course {
    private String name;
    List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student s) {
        students.add(s);
    }

    public static Course getMathClass() {
        Course out = new Course("Math");
        out.addStudent(Student.getStandardStudentList().get(0));
        out.addStudent(Student.getStandardStudentList().get(1));
        return out;
    }
    public static Course getChemClass() {
        Course out = new Course("Math");
        out.addStudent(Student.getStandardStudentList().get(3));
        out.addStudent(Student.getStandardStudentList().get(1));
        return out;
    }
}

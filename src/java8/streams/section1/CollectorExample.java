package java8.streams.section1;

import java8.models.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by John on 7/25/2018.
 */
public class CollectorExample {
    public static void main(String[] args) {
        List<Student> studList = Student.getStandardStudentList();
        List<String> names = studList.stream().map(Student::getName).collect(Collectors.toList());
        names.forEach(System.out::println);

        String result = studList.stream().map(Student::getName).collect(Collectors.joining(",","[","]"));
        System.out.println("Result = " + result);

        double aveAge = studList.stream().collect(Collectors.averagingInt(Student::getAge));
        System.out.println("Average age: " + aveAge);

//        John
//        Betsey
//        Thorin
//        Clifford
//        Sam
//        Gwen
//        Result = [John,Betsey,Thorin,Clifford,Sam,Gwen]
//        Average age: 25.166666666666668
    }
}

package java8.streams.section1;

import java8.models.Course;
import java8.models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by John on 7/11/2018.
 */
public class MapExample {
    public static void main(String[] args) {
        mapExample();
        flatMapExample();
    }

    private static void flatMapExample() {
        System.out.println("flatMapExample()");
        Course math = Course.getMathClass();
        Course chem = Course.getChemClass();
        List<Course> allCourses = Arrays.asList(math, chem);

        Stream<Student> allStudentNames = allCourses.stream().flatMap(course->course.getStudents().stream());
        allStudentNames.forEach(System.out::println);
    }
    private static void mapExample() {
        System.out.println("mapExample()");
        List<Student> studList = Student.getStandardStudentList();
        Stream<String> names = studList.stream().map(s->s.getName());
        names.forEach(System.out::println);
    }
}

package java8.streams.section1;

import java8.models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by John on 7/11/2018.
 */
public class DoWorkExample {
    public static void main(String[] args) {
        simpleStream();
        parallelStream();
    }

    private static void parallelStream() {
        List<Student> stuList = Student.getStandardStudentList();

        Stream<Student> parallelStream = stuList.parallelStream();
        System.out.println("=========");
        parallelStream.forEach(s->doProcess(s));
    }
    private static void doProcess(Student s) {
        System.out.println(s);
    }
    private static void simpleStream() {
        String strArray[] = {"aa", "bb", "cc", "dd", "ee", "ff"};
        Stream<String> strStream = Arrays.stream(strArray);
        System.out.println("=========");
        strStream.forEach(System.out::println);
    }

}

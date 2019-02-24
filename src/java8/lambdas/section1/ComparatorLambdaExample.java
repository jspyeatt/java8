package java8.lambdas.section1;

import java8.models.Student;

import java.util.*;

/**
 * Created by John on 7/4/2018.
 */
public class ComparatorLambdaExample {
    private static final List<Student> ORIGINAL_LIST = Arrays.asList(new Student("John", 55),
                                                                     new Student("Betsey", 53),
                                                                     new Student("Sam", 20),
                                                                     new Student("Gwen", 18));
    public static void main(String[] args) {

        sortWithComparator();

//        ========= sortWithComparator()
//        ------ before sort ---------
//        Student{name='John', age=55}
//        Student{name='Betsey', age=53}
//        Student{name='Sam', age=20}
//        Student{name='Gwen', age=18}
//        ------ after lambda sort ---------
//        Student{name='Betsey', age=53}
//        Student{name='Gwen', age=18}
//        Student{name='John', age=55}
//        Student{name='Sam', age=20}
//        ---- after sorting with Comparator.comparing() static method
//        Student{name='Betsey', age=53}
//        Student{name='Gwen', age=18}
//        Student{name='John', age=55}
//        Student{name='Sam', age=20}
    }

    private static void sortWithComparator() {
        System.out.println("========= sortWithComparator()");
        List<Student> stdList = new ArrayList(ORIGINAL_LIST);

        System.out.println("------ before sort ---------");
        stdList.forEach(System.out::println);

        // with lambda
        Collections.sort(stdList, (s1, s2)->s1.name.compareTo(s2.name));

        System.out.println("------ after lambda sort ---------");
        stdList.forEach(System.out::println);

        stdList = new ArrayList(ORIGINAL_LIST);
        System.out.println("---- after sorting with Comparator.comparing() static method");
        Collections.sort(stdList, Comparator.comparing(s -> s.name));
        stdList.forEach(System.out::println);
    }
}

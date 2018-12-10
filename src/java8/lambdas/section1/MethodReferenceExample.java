package java8.lambdas.section1;

import java8.models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

/**
 * Created by John on 7/5/2018.
 */
public class MethodReferenceExample {
    public static void main(String[] args) {
        executeStaticMethod();
        referenceConstructor();
        referenceToInstanceMethod();
    }

    private static void referenceToInstanceMethod() {
        List<Student> stuList = Arrays.asList(new Student("John", 55), new Student("Betsey", 54), new Student("Sam", 20), new Student("Gwen", 18));
        List<String> names = MethodReferenceExample.getStudentsName(stuList, Student::getName);
        System.out.println("Student names");
        names.forEach(n->System.out.println("Student name " + n));
    }

    private static List<String> getStudentsName(List<Student> stuList, Function<Student, String> f) {
        List<String> results = new ArrayList<>();
        stuList.forEach(s->results.add(f.apply(s)));
        return results;
    }
    private static void referenceConstructor() {
        System.out.println("----------------");
        List<Integer> numbers = Arrays.asList(4,9,36,100);
        numbers.forEach((i)->System.out.println("Before sqrt " + i));
        List<Double> squareRoots = MethodReferenceExample.findSquareRoots(numbers, Integer::new);
        squareRoots.forEach((d)->System.out.println("After sqrt " + d));
    }
    private static List<Double> findSquareRoots(List<Integer> numbers, Function<Integer, Integer> f) {
        List<Double> results = new ArrayList<>();
        numbers.forEach(x->results.add(Math.sqrt(f.apply(x))));
        return results;
    }
    private static void executeStaticMethod() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // lambda reference to static method.
        Runnable command = MethodReferenceExample::myStaticRun;
        executorService.execute(command);
    }
    private static void myStaticRun() {
        System.out.println("----------------");
        System.out.println("myStaticRun() is running");
    }
}

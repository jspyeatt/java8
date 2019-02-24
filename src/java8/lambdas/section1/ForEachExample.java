package java8.lambdas.section1;

        import java8.models.Student;

        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.function.Consumer;

/**
 * Created by John on 6/28/2018.
 */
public class ForEachExample {
    public static void main(String[] args) {
        loopExampleForLists();
        loopExampleForMaps();
    }

    private static void loopExampleForMaps() {
        System.out.println("--- loopExampleForMaps() ---");
        Map<Integer, Student> studMap = Student.getStandardStudentMap();

        studMap.forEach((k,v)->System.out.println("k=" + k + " v=" + v));

//        --- loopExampleForMaps() ---
//        k=101 v=Student{name='Betsey', age=13}
//        k=10 v=Student{name='John', age=15}
//        k=203 v=Student{name='Thorin', age=1}
//        k=204 v=Student{name='Clifford', age=2}
    }
    private static void loopExampleForLists() {
        System.out.println("--- loopExampleForLists() ---");
        List<String> nameList = Arrays.asList("Rick", "Randy", "Ron");

        nameList.forEach(n->{System.out.println(n);
                             System.out.println("======");});

        List<Student> stuList = Arrays.asList(new Student("Sam", 20), new Student("Gwen", 18));

        // all of the below iterations are called internal iterations because
        // they are part of the Collection.
        // with consumer class
        stuList.forEach(new StudentConsumer());

        // with lambda
        stuList.forEach((s)->System.out.println("lambda:" + s));

        // meta reference
        stuList.forEach(System.out::println);

//        --- loopExampleForLists() ---
//        Rick
//        ======
//        Randy
//        ======
//        Ron
//        ======
//        StudentConsumer accept() Student{name='Sam', age=20}
//        StudentConsumer accept() Student{name='Gwen', age=18}
//        lambda:Student{name='Sam', age=20}
//        lambda:Student{name='Gwen', age=18}
//        Student{name='Sam', age=20}
//        Student{name='Gwen', age=18}
    }
}
class StudentConsumer implements Consumer<Student> {

    @Override
    public void accept(Student student) {
        System.out.println("StudentConsumer accept() " + student);
    }
}


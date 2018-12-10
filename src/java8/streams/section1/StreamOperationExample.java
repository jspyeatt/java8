package java8.streams.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by John on 7/11/2018.
 */
public class StreamOperationExample {
    private static final List<String> list = Arrays.asList("John", "Betsey", "John", "Sam", "Gwen");
    public static void main(String[] args) {


        distinctExample();
        anyMatchExample();

        filterExample();
    }

    private static void filterExample() {
        System.out.println("filterExample()");
        Stream<String> hasS = list.stream().filter(element->element.toLowerCase().contains("s"));

        hasS.forEach(System.out::println);
    }

    private static void anyMatchExample() {
        System.out.println("anyMatchExample()");
        boolean containsE = list.stream().anyMatch(element->element.contains("e"));
        boolean containsZ = list.stream().anyMatch(element->element.contains("Z"));
        System.out.println("Do any elements contain an e? " + containsE);
        System.out.println("Do any elements contain an Z? " + containsZ);
    }

    private static void distinctExample() {
        System.out.println("distinctExample()");
        Stream<String> stream = list.stream();
        Stream<String> distinct = stream.distinct();
        distinct.forEach(System.out::println);

        System.out.println("num distinct " + list.stream().distinct().count());
    }
}

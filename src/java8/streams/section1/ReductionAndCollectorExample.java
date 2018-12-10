package java8.streams.section1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by John on 7/15/2018.
 */
public class ReductionAndCollectorExample {
    public static void main(String[] args) {
        reductionExample();
        collectionExample();
        intStreamExample();
    }

    private static void reductionExample() {
        List<Integer> integers = Arrays.asList(4,5,2,6,4);

        Integer sum = integers.stream().reduce(0, (x,y)->x+y);
        System.out.println("sum=" + sum);
    }

    private static void collectionExample() {
        List<String> list = Arrays.asList("Sam", "Gwen", "John", "Betsey");
        List<String> out = list.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
        out.forEach(System.out::println);
    }

    private static void intStreamExample() {
        // 1+2+3
        OptionalInt reduced = IntStream.range(1,4).reduce((a, b)->a+b);
        System.out.println("intStreamExample = " + reduced.getAsInt());

        // 10+1+2+3
        int intValue = IntStream.range(1,4).reduce(10, (a,b)->a+b);
        System.out.println("intValue= " + intValue);

        Integer r = Arrays.asList(1,2,3).parallelStream().reduce(10,(a,b)->a+b, (a,b)->{
            System.out.println("Combiner " + a);
            return a+b;});
        // 11+12+13
        System.out.println("3 arg with combiner " + r);
    }
}

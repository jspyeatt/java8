package java8.streams.section1;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by John on 7/20/2018.
 */
public class InfiniteStreamExample {
    public static void main(String args[]) {
        simpleExample();
        customTypeExample();
    }
    private static void customTypeExample() {
        Supplier<UUID> sup = UUID::randomUUID;
        Stream<UUID> str = Stream.generate(sup);
        List<UUID> uuids = str.limit(10).collect(Collectors.toList());
        uuids.forEach(System.out::println);
    }
    private static void simpleExample() {
        Stream<Integer> str = Stream.iterate(9, i-> i + 3);
        List<Integer> result = str.skip(3).limit(10).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}

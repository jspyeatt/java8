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
//        d65e45c8-42ec-4d17-a0b2-f0f8b2d44187
//        3a8990ac-e437-4f4c-bd09-30fbe8e3adc1
//        7dbd5348-0c4e-4246-96f0-7f11ca96d589
//        4dcd5de5-da47-4886-9d22-3ab87d17ed6f
//        c816f489-8528-48a4-9122-a56e03ab3540
//        6d530eea-de44-4711-8272-0826e828963e
//        2f5e3d71-f651-4234-a982-46c787a91c36
//        1610ecd3-6230-4da8-965c-0622d63dd802
//        772bdbcd-5979-482f-aa41-ab437d6e75b1
//        874db374-37be-4838-8a73-726b4132cde9
    }
    private static void simpleExample() {
        Stream<Integer> str = Stream.iterate(9, i-> i + 3);
        List<Integer> result = str.skip(3).limit(10).collect(Collectors.toList());
        result.forEach(System.out::println);

//        18
//        21
//        24
//        27
//        30
//        33
//        36
//        39
//        42
//        45
    }
}

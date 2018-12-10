package java8.optional;

import java.util.Optional;

/**
 * Created by John on 7/26/2018.
 */
public class OptionalExample {
    public static void main(String[] args) {
        Optional<Integer> a = Optional.ofNullable(new Integer(5));
        Optional<Integer> b = Optional.ofNullable(null);


        Integer val = sum(a,b);
        System.out.println("val=" + val);
    }
    private static Integer sum(Optional<Integer> x, Optional<Integer>y) {
        return x.orElse(new Integer(0)) + y.orElse(new Integer(0));
    }
}

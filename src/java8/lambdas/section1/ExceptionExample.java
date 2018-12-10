package java8.lambdas.section1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by John on 7/9/2018.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3,9,7,0,10);
        integers.forEach(consumerWrapper(i->System.out.println(50/i), Exception.class));
    }

    private static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer <T> consumer, Class<E> clazz) {
        return i->{
          try {
              consumer.accept(i);
          } catch (Exception e) {
              System.out.println("Exception has thrown i=" + i + " " + e.getMessage());
          }
        };
    }
}

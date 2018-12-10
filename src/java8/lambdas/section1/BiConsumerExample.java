package java8.lambdas.section1;

import java8.models.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by John on 7/26/2018.
 */
public class BiConsumerExample {
    public static void main(String args[]) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        // explicitly create biconsumer class
        BiConsumer<Integer,String> biConsumer = (k,v)->System.out.println("K=" + k + " V=" + v);
        map.forEach(biConsumer);

        Map<Integer,Student> studMap = new HashMap<>();
        studMap.put(1,new Student("John", 55));
        studMap.put(2,new Student("Betsey", 54));

        // embed lambda
        studMap.forEach((k,v)->System.out.println(k + " Name:" + v.getName()));
    }
}

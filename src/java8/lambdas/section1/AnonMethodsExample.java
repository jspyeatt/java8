package java8.lambdas.section1;


public class AnonMethodsExample {
    public static void main(String[] args) {
        // simple interface with single statement in lambda
        NoArgInterface nai1 = ()->System.out.println("This is a no arg");
        nai1.method1();

        // multi-statement lambda
        NoArgInterface nai2 = ()->{System.out.println("No Arg First Line");
                                   System.out.println("No Arg Second Line");};
        nai2.method1();

        OneArgInterface oai1 = (String name)->{System.out.println("-----");
                                               System.out.println("One Arg:" + name);};
        oai1.method2("Steve");

        TwoArgInterface tai =  (String name, int age)->{System.out.println(String.format("%s is %d years old", name, age));};
        tai.method3("bill", 57);

//        This is a no arg
//        No Arg First Line
//        No Arg Second Line
//        -----
//        One Arg:Steve
//        bill is 57 years old
    }
}

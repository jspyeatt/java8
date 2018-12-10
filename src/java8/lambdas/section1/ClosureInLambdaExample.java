package java8.lambdas.section1;

/**
 * Created by John on 7/5/2018.
 */
public class ClosureInLambdaExample {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        doOperate(x, n->System.out.println((n + y)));
    }


    private static void doOperate(int i, Operation o) {
        o.operate(i);
    }
}
interface Operation {
    void operate(int x);
}

package java8.concurrency;

/**
 * Created by John on 12/22/2019.
 */

public class MyRunnable implements Runnable {
    private final long countUntil;

    public MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 0; i < countUntil; i++) {
            sum += 1;
        }
        System.out.println(Thread.currentThread().getName() + " sum " + sum);
    }
}
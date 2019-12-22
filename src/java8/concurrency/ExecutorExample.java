package java8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by John on 12/22/2019.
 */
public class ExecutorExample {
    private static final int NTHREADS = 10;
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(NTHREADS);
        for (int i = 0; i < 200; i++) {
            Runnable worker = new MyRunnable(1000000L + i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        executorService.awaitTermination(5L, TimeUnit.SECONDS);
    }
}

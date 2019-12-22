package java8.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 12/22/2019.
 */
public class SimpleThreadsExample {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 0; i < 200; i++) {
            Runnable task = new MyRunnable(10000000L + i);
            Thread worker = new Thread(task);
            worker.setName("Thread :" + i);
            worker.start();
            threads.add(worker);
        }
        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + " threads.");
        } while (running > 0);
    }

}

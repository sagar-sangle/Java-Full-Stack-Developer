package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 6; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("hello number: " + finalI);
                try {
                    Thread.sleep(2000); // Simulating work
                } catch (InterruptedException e) {
                    System.out.println("Task " + finalI + " was interrupted!");
                }
            });
        }

        System.out.println("Shutting down now...");
        executorService.shutdown(); // Gracefully shut down

        if (!executorService.awaitTermination(3, TimeUnit.SECONDS)) {
            System.out.println("Forcing shutdown...");
            executorService.shutdownNow(); // Force shutdown if timeout exceeded
        }

        System.out.println("All tasks completed or interrupted.");
    }
}

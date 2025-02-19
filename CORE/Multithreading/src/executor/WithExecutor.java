package executor;

/*
The Executor Framework in Java is used for managing and controlling multiple threads efficiently. Instead of manually creating and managing threads,
it provides a pool of worker threads that can execute tasks asynchronously.

🔹 Better Performance: Reduces thread creation overhead.
🔹 Thread Reusability: Uses a thread pool instead of creating new threads.
🔹 Better Control: You can schedule, limit, and monitor threads.
🔹 Automatic Thread Management: No need to manually start, stop, or join threads.
 */


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class WithExecutor {
    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {

            fact = fact * i;



        }
        try {

            Thread.sleep(1000);//simulating some work

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return fact;
    }
    public static void main(String[] args) {



        long startTime = System.currentTimeMillis();
        System.out.println("start time : "+System.currentTimeMillis());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        


        for (int i = 1; i <= 9; i++) {
            int num = i;  // Capture the loop variable
            /* why store i;            The loop does not wait for each thread to finish.By the time a thread actually runs, i might already be a new value!This can lead to wrong outputs or errors.*/

            executorService.submit(() -> {
                int result = fact(num);

                System.out.println("Factorial of " + num + " is: " + result);
            });
/*
✅ Benefits of Using Executor Framework:
✔ Thread Pooling → Reuses existing threads.
✔ Efficient Resource Management → Controls the number of threads.
✔ Easy Task Submission → Just submit() or execute().
✔ Built-in Scheduling → Allows running tasks at specific times.
 */



        }
        executorService.shutdown();



        System.out.println("total time :"+(System.currentTimeMillis()-startTime));
    }
}

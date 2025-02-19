import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureAndCallableDemo {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> task = ()-> 10+20;

        Future<Integer> future = executorService.submit(task);

       try {
           Integer i = future.get();
           System.out.println(i);
           future.isDone();


       } catch (Exception e) {
           throw new RuntimeException(e);
       }


//       executorService.awaitTermination()



        List<Callable<String>> tasks = Arrays.asList(
                () -> { Thread.sleep(2000); return "Task 1 done"; },
                () -> { Thread.sleep(1000); return "Task 2 done"; },
                () -> { Thread.sleep(3000); return "Task 3 done"; }
        );




        List<Future<String>> results = null;
        try {
            results = executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Future<String> fut : results) {
            try {
                try {
                    System.out.println(fut.get()); // Blocking call
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();


    }

}

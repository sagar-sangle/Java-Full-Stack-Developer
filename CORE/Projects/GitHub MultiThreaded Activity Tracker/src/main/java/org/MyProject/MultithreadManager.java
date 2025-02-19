package org.MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultithreadManager {

    private static final int THREAD_POOL_SIZE = 3;
    private final ExecutorService service;
    GitHubFetcher fetcher = new GitHubFetcher();


    public MultithreadManager() {
        this.service = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    }

    public void fetchUsersActivities(List<String> usernames) {

        List<Future<List<UserActivity>>> futures = new ArrayList<>();



        for (String username : usernames) {

            Callable<List<UserActivity>> task = () -> fetcher.fetchActivities(username);//Type parameters:
//<V> – the result type of method call inside generic parameter
            futures.add(service.submit(task));

        }


        //processing
        for (Future<List<UserActivity>> future : futures) {

            try {
                List<UserActivity> activities = future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        service.shutdown();
    }

    public void shutdown() {
        service.shutdown();
        try {
            if (!service.awaitTermination(5, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            service.shutdownNow();
        }

    }
}

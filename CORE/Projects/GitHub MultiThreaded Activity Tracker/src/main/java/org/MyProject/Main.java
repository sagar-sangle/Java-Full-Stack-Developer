package org.MyProject;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.MyProject.GitHubFetcher;
import org.MyProject.MultithreadManager;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {




//        OkHttpClient http = new OkHttpClient();//create instance
//
//        Request request = new Request.Builder().url("https://jsonplaceholder.typicode.com/posts/1").build();//build and finlizew the req
//
//        //execute the req and get the response
//        try {
//            Response res = http.newCall(request).execute();
//            if (res.isSuccessful()){
//                if (res.body() != null) {
//                    System.out.println(res.body().string());
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("request successfull");
     GitHubFetcher git = new GitHubFetcher();
        List<String> usernames = Arrays.asList("torvalds", "octocat", "mojombo", "pjhyett", "defunkt");

        MultithreadManager manager = new MultithreadManager();
        manager.fetchUsersActivities(usernames);

    }
}
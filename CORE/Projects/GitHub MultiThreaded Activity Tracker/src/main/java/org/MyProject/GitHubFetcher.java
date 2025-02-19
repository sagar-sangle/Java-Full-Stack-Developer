package org.MyProject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GitHubFetcher {

    private static final String API_URL = "https://api.github.com/users/%s/events/public";
    private static final OkHttpClient client = new OkHttpClient();
    private static final ObjectMapper mapper = new ObjectMapper();

    public List<UserActivity> fetchActivities(String username) throws IOException {

        String url = String.format(API_URL, username);
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            System.out.println("Unable to fetch data for user: " + username);
            return new ArrayList<>();
        }

        // ✅ Read the response body **once** and store it
        String responseBody = response.body().string();

        // ✅ Debugging: Print the raw JSON response
        System.out.println("Response: " + responseBody);

        // ✅ Convert JSON response to a JSON Node
        JsonNode jsonArray = mapper.readTree(responseBody);

        List<UserActivity> activities = new ArrayList<>();

        for (JsonNode node : jsonArray) {
            UserActivity activity = new UserActivity();
            activity.setUsername(username); // ✅ Set actual username
            activity.setType(node.get("type").asText()); // ✅ Use `setType`
            activity.setRepoName(node.get("repo").get("name").asText());
            activity.setCreatedAt(node.get("created_at").asText());
            activities.add(activity);
        }

        return activities;
    }
}

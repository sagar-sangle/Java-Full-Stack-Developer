package org.MyProject;

public class UserActivity {


    private String username;
    private String repoName;
    private String createdAt;
    private String getType;

    public UserActivity() {
    }

    public UserActivity(String username, String repoName, String createdAt, String getType) {
        this.username = username;
        this.repoName = repoName;
        this.createdAt = createdAt;
        this.getType = getType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return getType;
    }

    public void setType(String getType) {
        this.getType = getType;
    }

    @Override
    public String toString() {
        return "UserActivity{" +
                "username='" + username + '\'' +
                ", repositoy Name='" + repoName + '\'' +
                ", created At='" + createdAt + '\'' +
                ", Type='" + getType + '\'' +
                '}';
    }
}

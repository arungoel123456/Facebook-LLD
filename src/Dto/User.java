package Dto;

import java.sql.*;
import java.util.*;

public class User {
    private String name;
    private String email;
    private String password;

    private List<User> followers;
    private List<User> usersFollowed;
    private boolean isCelebrity;
    private Feedwall feedwall;
    private Timeline timeline;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getUsersFollowed() {
        return usersFollowed;
    }

    public void setUsersFollowed(List<User> usersFollowed) {
        this.usersFollowed = usersFollowed;
    }

    public boolean isCelebrity() {
        return isCelebrity;
    }

    public void setCelebrity(boolean celebrity) {
        isCelebrity = celebrity;
    }

    public Feedwall getFeedwall() {
        return feedwall;
    }

    public void setFeedwall(Feedwall feedwall) {
        this.feedwall = feedwall;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }


}

package Dto;

import java.util.*;

public class Timeline {
    private List<Post> posts;
    private User user;
    public void addPost(Post post){
        this.posts.add(post);
        return;
    }
}

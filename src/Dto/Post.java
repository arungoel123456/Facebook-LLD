package Dto;

import java.util.*;

public class Post {
    private String description;
    private User createdBy;
    private List<Like> likes;
    private List<Comment> comments;

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void addLike(Like like){
        this.likes.add(like);
    }

}

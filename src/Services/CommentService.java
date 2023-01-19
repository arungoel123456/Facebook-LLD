package Services;

import Dto.*;

public class CommentService {
    public void putCommentOnPost(Post post, Comment comment){
        post.addComment(comment);
    }

    // We can also get commentId from frontend, in that case we will have to fetch comments from the server ad put it.
    public void putCommentOnComment(Comment parent, Comment newComment){
        parent.addComment(newComment);
        return;
    }
}

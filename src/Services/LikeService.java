package Services;

import Dto.*;

public class LikeService {

    /// keeping the return type as void as for a single page application, frontend can handle incrementing the like.
    public void putLikeOnPost(Post post, Like like){
        post.addLike(like);
    }

    public void removeLikeOnPost(Post post, User user){

    }

    public void putLikeOnComment(Comment comment, Like like){
        comment.addLike(like);
    }

    public void removeLikeOnComment(Comment comment, User user){

    }
}

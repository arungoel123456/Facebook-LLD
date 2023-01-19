package Services;

import Dto.*;

public class PostService {
    public void createPost(User user, Post post){
        user.getTimeline().addPost(post);
        // handle posting for celebs and non celebs
    }

    public Feedwall fetchFeedwall(User user){

        // do the operation of getting the feed of the celebs that this user ahs followed;
        return user.getFeedwall();
    }

    public Timeline fetchTimeline(User user){
        return user.getTimeline();
    }
}

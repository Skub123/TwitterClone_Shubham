package shubham.twitter_clone_backend.service;

import shubham.twitter_clone_backend.exceptions.TwitException;
import shubham.twitter_clone_backend.exceptions.UserException;
import shubham.twitter_clone_backend.model.Like;
import shubham.twitter_clone_backend.model.User;

import java.util.List;

public interface LikeService {

    public Like likeTwit(Long twitId, User user) throws UserException, TwitException;

    public List<Like> getAllLikes(Long twitId) throws TwitException;
}

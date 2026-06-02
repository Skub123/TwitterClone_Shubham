package shubham.twitter_clone_backend.service;

import shubham.twitter_clone_backend.exceptions.TwitException;
import shubham.twitter_clone_backend.exceptions.UserException;
import shubham.twitter_clone_backend.model.Twit;
import shubham.twitter_clone_backend.model.User;
import shubham.twitter_clone_backend.request.TwitReplyRequest;

import java.util.List;

public interface TwitService {

    public Twit createTwit(Twit request, User user) throws UserException;

    public List<Twit> findAllTwits();

    public Twit retwit(Long twitId, User user) throws UserException, TwitException;

    public Twit findById(Long twitId) throws TwitException;

    public void deleteTwitById(Long twitId, Long userId) throws TwitException, UserException;

    public Twit removeFromRetwit(Long twitId, User user) throws TwitException, UserException;

    public Twit createReply(TwitReplyRequest request, User user) throws TwitException;

    public List<Twit> getUserTwit(User user);

    public List<Twit> findByLikesContainsUser(User user);


}

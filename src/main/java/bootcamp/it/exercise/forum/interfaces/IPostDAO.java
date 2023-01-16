package bootcamp.it.exercise.forum.interfaces;

import bootcamp.it.exercise.forum.model.Post;

import java.util.List;
import java.util.Optional;

public interface IPostDAO {
    Optional<List<Post>> getPosts();

    void addPost(Post post);
}

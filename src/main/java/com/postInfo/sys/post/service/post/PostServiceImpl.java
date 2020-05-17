package com.postInfo.sys.post.service.post;

import com.postInfo.sys.post.model.Post;
import com.postInfo.sys.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//import org.bson.types.String;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll(String userId) {
        List<Post> posts = new ArrayList<>();
        postRepository.findByUserId(userId).forEach(posts::add);
        return posts;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post findBy_id(String id) {
        return postRepository.findBy_id(id);
    }

    @Override
    public void delete(Post by_id) {
        postRepository.delete(by_id);
    }
}

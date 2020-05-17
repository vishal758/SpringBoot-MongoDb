package com.postInfo.sys.post.service.post;

import com.postInfo.sys.post.model.Post;
//import org.bson.types.String;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<Post> findAll(String userId);

    Post save(Post post);

    Post findBy_id(String id);

    void delete(Post by_id);
}

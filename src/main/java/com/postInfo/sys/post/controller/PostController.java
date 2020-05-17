package com.postInfo.sys.post.controller;
import com.postInfo.sys.post.model.Post;
import com.postInfo.sys.post.service.post.PostService;
import com.postInfo.sys.post.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("users/{userId}/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Post> getAllPosts(@PathVariable String userId) {
        return postService.findAll(userId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getPostById(@PathVariable("id") String id, @PathVariable String userId) {
        return postService.findBy_id(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Post createPost(@Valid @RequestBody Post post, @PathVariable String userId) {
        post.set_id(post.get_id());
        post.setUserId(userId);
        postService.save(post);
        return post;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPostById(@PathVariable("id") String id, @Valid @RequestBody Post post, @PathVariable String userId) {
        post.set_id(id);
        post.setUserId(userId);
        postService.save(post);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable String id, @PathVariable String userId) {
        postService.delete(postService.findBy_id(id));
    }
}



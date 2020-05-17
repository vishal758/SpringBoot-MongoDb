package com.postInfo.sys.post.controller;

import com.postInfo.sys.post.model.User;
import com.postInfo.sys.post.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getPostById(@PathVariable("id") String id) {
        return userService.findBy_id(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User createPost(@Valid @RequestBody User user) {
        user.set_id(user.get_id());
        userService.save(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPostById(@PathVariable("id") String id, @Valid @RequestBody User user) {
        user.set_id(id);
        userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable String id) {
        userService.delete(userService.findBy_id(id));
    }
}

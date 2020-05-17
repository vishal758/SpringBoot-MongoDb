package com.postInfo.sys.post.repository;

//import com.postInfo.sys.post.model.Post;
import com.postInfo.sys.post.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findBy_id(String id);
}

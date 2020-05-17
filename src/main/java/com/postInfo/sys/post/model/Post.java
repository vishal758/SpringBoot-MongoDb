package com.postInfo.sys.post.model;

//import org.bson.types.String;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "post")
public class Post {
    @Id
    private String _id;
    private String title;
    private String desc;
    private String userId;

    public Post(String _id, String title, String desc, String userId) {
        this._id = _id;
        this.title = title;
        this.desc = desc;
        this.userId = userId;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
package com.postInfo.sys.post.model;

//import org.bson.types.String;
import com.postInfo.sys.post.pojo.ContactDetails;
import com.postInfo.sys.post.pojo.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String _id;
    private String name;
    private String userName;
    private String email;
    private String desc;
    private ContactDetails contactDetails;
    private Profile profile;

    public User(String _id, String name, String userName, String email, String desc, ContactDetails contactDetails, Profile profile) {
        this._id = _id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.desc = desc;
        this.contactDetails = contactDetails;
        this.profile = profile;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", desc='" + desc + '\'' +
                ", contactDetails=" + contactDetails +
                ", profile=" + profile +
                '}';
    }
}

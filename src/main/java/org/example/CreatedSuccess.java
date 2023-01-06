package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatedSuccess {
    @JsonProperty("userID")
    public Integer userID;
    @JsonProperty("userId")
    public Integer userId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("body")
    public String body;
    @JsonProperty("id")
    public Integer id;

    public CreatedSuccess() {
        super();
    }

    public CreatedSuccess(Integer userID, String title, String body, Integer id) {
        this.userID = userID;
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString()
    {
        return "UserId: " + this.userID + "\n" + "Title: " + this.title + "\n" + "Body: " + this.body + "\n" + "Id: " + this.id;
    }
}

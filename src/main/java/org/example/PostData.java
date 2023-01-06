package org.example;

public class PostData {
    public Integer userID;
    public String title;
    public String body;

    public PostData(Integer userID, String title, String body) {
        this.userID = userID;
        this.title = title;
        this.body = body;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
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

    @Override
    public String toString()
    {
        return this.userID + " " + this.title + " " + this.body;
    }
}

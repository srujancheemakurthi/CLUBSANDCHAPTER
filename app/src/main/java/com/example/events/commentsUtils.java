package com.example.events;

public class commentsUtils {
    String Comment;
    String UserId;
    String Time;

    public commentsUtils(String comment, String userId, String time) {
        Comment = comment;
        UserId = userId;
        Time = time;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public commentsUtils() {

    }
}


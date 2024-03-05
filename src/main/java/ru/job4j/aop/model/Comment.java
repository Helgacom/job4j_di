package ru.job4j.aop.model;

public class Comment {

    private String comment;
    private String userName;

    public Comment(String comment, String userName) {
        this.comment = comment;
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Comment{comment=%s, userName=%s}".formatted(comment, userName);
    }
}

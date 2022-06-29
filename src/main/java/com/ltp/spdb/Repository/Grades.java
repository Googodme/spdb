package com.ltp.spdb.Repository;

import java.util.UUID;

public class Grades{
    private String name;
    private String subject;
    private String score;
    private String id;

    public Grades() {
        this.id= UUID.randomUUID().toString();
    }

    public Grades(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Grades name(String name) {
        setName(name);
        return this;
    }

    public Grades subject(String subject) {
        setSubject(subject);
        return this;
    }

    public Grades score(String score) {
        setScore(score);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", score='" + getScore() + "'" +
            ", subject='" + getSubject() + "'" +
            "}";
    }

}
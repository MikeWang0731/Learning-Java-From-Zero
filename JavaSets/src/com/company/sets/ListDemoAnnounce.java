package com.company.sets;

import java.util.Date;

public class ListDemoAnnounce {
    private int id;
    private String title;
    private String creator;
    private Date time;

    public ListDemoAnnounce() {
    }

    public ListDemoAnnounce(int id, String title, String creator, Date time) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void info() {
        System.out.println("==================");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Creator: " + getCreator());
        System.out.println("Time: " + getTime());
        System.out.println("==================");
    }
}

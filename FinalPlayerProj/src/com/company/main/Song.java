package com.company.main;

import java.util.Objects;

/**
 * 歌曲类
 */
public class Song {
    private String id;
    private String name;
    private String singer;

    public Song() {
    }

    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    // hashCode()配合equals()来判断两个对象实例是否一样
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) && Objects.equals(name, song.name) && Objects.equals(singer, song.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, singer);
    }

    @Override
    public String toString() {
        return "[歌曲信息] ID: " + getId() + ", 歌曲名称: " + getName() + ", 演唱者: " + getSinger();
    }
}

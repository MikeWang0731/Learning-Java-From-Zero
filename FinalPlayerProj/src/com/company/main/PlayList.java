package com.company.main;

import java.util.ArrayList;

public class PlayList {
    // 播放列表的名称
    private String playListName;
    // 播放列表的歌曲集合
    private ArrayList<Song> musicList;

    public PlayList() {
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public ArrayList<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(ArrayList<Song> musicList) {
        this.musicList = musicList;
    }

    /**
     * 构造方法：在初始化这个播放列表(歌单)的同时，初始化一个用于存放歌曲的列表
     *
     * @param playListName 名称
     */
    public PlayList(String playListName) {
        this.playListName = playListName;
        musicList = new ArrayList<>();
    }

    /**
     * 奖歌曲添加到播放列表
     *
     * @param song 要添加的歌曲
     */
    public void addToPlayList(Song song) {
        // 首先检查歌曲是否已经存在
        boolean existFlag = false;
        // 用for循环对列表中的每个歌曲进行比较
        for (Song songInList :
                musicList) {
            if (songInList.equals(song)) {
                existFlag = true;
                break;
            }
        }
        if (existFlag) {
            System.out.println("歌曲已经存在于当前歌单，添加失败");
        } else {
            musicList.add(song); // 添加至列表
        }
    }

    /**
     * 显示播放列表的所有歌曲
     */
    public void displayAllSong() {
        System.out.println("播放列表的所有歌曲：");
        for (Song song :
                musicList) {
            System.out.println(song);
        }
    }

    /**
     * 通过歌曲ID查询歌曲
     * @param id 歌曲ID
     * @return 查询到的歌曲(Song类型的实例)
     */
    public Song searchSongById(String id) {
        Song song = null;
        // ID一定是唯一的
        for (Song songInList :
                musicList) {
            // 用列表里的每一首歌曲的id和我们传入的id进行比较，如果一样就找到了
            if (songInList.getId().equals(id)) {
                song = songInList;
                break;
            }
        }
        return song;
    }

    /**
     * 通过歌曲名称进行查找
     * @param name 歌曲名称
     * @return 查询到的歌曲(Song类型的实例)
     */
    public Song searchSongByName(String name) {
        Song song = null;
        // ID一定是唯一的
        for (Song songInList :
                musicList) {
            // 用列表里的每一首歌曲的名字和我们传入的名字进行比较，如果一样就找到了
            if (songInList.getName().equals(name)) {
                song = songInList;
                break;
            }
        }
        return song;
    }

    /**
     * 修改播放列表中的歌曲信息
     * @param id 要修改的ID
     * @param song 新的歌曲信息
     */
    public void updateSong(String id, Song song) {
        Song searchResult = searchSongById(id);
        if (searchResult == null) {
            System.out.println("没有这个歌曲，无法修改信息");
        } else {
            // 先移除原来的信息再重新添加
            musicList.remove(searchResult);
            musicList.add(song);
            System.out.println("修改成功！");
        }
    }

    // 删除播放列表中的指定歌曲
    public void deleteSong(String id) {
        Song searchResult = searchSongById(id);
        if (searchResult != null) {
            musicList.remove(searchResult);
            System.out.println("删除成功");
        } else {
            System.out.println("没有这首歌曲！");
        }
    }
}

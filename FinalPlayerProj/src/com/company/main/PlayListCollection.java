package com.company.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 播放列表(歌单)集合
 */
public class PlayListCollection {
    // 使用key-value的方式来存放歌单集合
    Map<String,PlayList> playListMap;

    public PlayListCollection() {
        playListMap = new HashMap<>();
    }

    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    /**
     * 向列表集合中添加新的列表
     * @param playList 要添加的列表
     */
    public void addPlayList(PlayList playList) {
        // 将播放列表的名称作为key值
        playListMap.put(playList.getPlayListName(), playList);
    }

    /**
     * 删除指定的播放列表
     * @param playList 待删除的列表
     */
    public void deletePlay(PlayList playList) {
        // 通过key值去删除指定的播放列表
        playListMap.remove(playList.getPlayListName());
    }

    /**
     * 通过名称查询播放列表
     * @param playListName 待查询的名称
     * @return 搜索结果(PlayList对象)
     */
    public PlayList searchListByName(String playListName) {
        PlayList playList = null;
        // 因为Name都是以Key的形式存储的，所以我们这里将所有的key取出来
        // 存到一个集合里进行查找
        Set<String> nameSet = playListMap.keySet();
        for (String name :
                nameSet) {
            if (name == playListName) {
                System.out.println("找到了！");
                // 通过key值取到对应的对象
                playList = playListMap.get(name);
                break;
            }
        }
        return playList;
    }

    /**
     * 打印所有列表
     */
    public void displayAllList() {
        Set<String> nameList = playListMap.keySet();
        System.out.println("播放列表名称为");
        for (String name :
                nameList) {
            System.out.println(name);
        }
    }
}

package Test;

import com.company.main.PlayList;
import com.company.main.PlayListCollection;
import com.company.main.Song;

public class TestDemo {
    public void testSong() {
        Song song1 = new Song("001", "两只老虎", "太阳合唱团");
        Song song2 = new Song("002", "小燕子", "风车合唱团");
        Song song3 = new Song("003", "茉莉花", "彩虹合唱团");
        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
        System.out.println("Song1和Song3相等吗？" + song1.equals(song3));
    }

    public void testPlayList() {
        Song song1 = new Song("001", "两只老虎", "太阳合唱团");
        Song song2 = new Song("002", "小燕子", "风车合唱团");
        Song song3 = new Song("003", "茉莉花", "彩虹合唱团");
        // 创建play list
        PlayList playList = new PlayList("主播放列表");
        playList.addToPlayList(song1);
        playList.addToPlayList(song2);
        playList.addToPlayList(song3);
        // 显示播放列表
        playList.displayAllSong();
        // 按照ID查询
        System.out.println("查找ID为001的歌曲：");
        Song searchResult = playList.searchSongById("001");
        if (searchResult != null) {
            System.out.println("找到了：" + searchResult);
        } else {
            System.out.println("抱歉！没找到！");
        }
        // 按名字查询
        System.out.println("查找名字为茉莉花的歌曲：");
        Song searchResult2 = playList.searchSongByName("茉莉花");
        if (searchResult2 != null) {
            System.out.println("找到了：" + searchResult2);
        } else {
            System.out.println("抱歉！没找到！");
        }
        // 修改歌曲
        Song song4 = new Song("004", "蜗牛和黄鹂", "小太阳合唱团");
        playList.updateSong("003", song4);
        System.out.println("当前播放列表：");
        playList.displayAllSong();

        // 删除歌曲信息
        playList.deleteSong("004");
        playList.displayAllSong();
    }

    public void testPlayListCollection() {
        Song song1 = new Song("001", "两只老虎", "太阳合唱团");
        Song song2 = new Song("002", "小燕子", "风车合唱团");
        Song song3 = new Song("003", "茉莉花", "彩虹合唱团");

        // 创建主列表
        PlayList mainPlayList = new PlayList("主播放列表");
        // 添加歌曲至主列表
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        mainPlayList.addToPlayList(song3);

        // 创建普通列表，从主列表里添加歌曲
        PlayList myFavourite = new PlayList("我最喜爱");
        myFavourite.addToPlayList(mainPlayList.getMusicList().get(0));

        myFavourite.displayAllSong();

        // 将两个列表添加到集合
        PlayListCollection collection = new PlayListCollection();
        collection.addPlayList(mainPlayList);
        collection.addPlayList(myFavourite);
        collection.displayAllList();

        // 根据列表名字查询信息，并显示歌曲
        PlayList searchResult = collection.searchListByName("我最喜爱");
        searchResult.displayAllSong();

        // 删除列表
        collection.deletePlay(myFavourite);
        collection.displayAllList();
    }

    public static void main(String[] args) {
        TestDemo demo = new TestDemo();
//        demo.testSong();
//        demo.testPlayList();
        demo.testPlayListCollection();
    }
}

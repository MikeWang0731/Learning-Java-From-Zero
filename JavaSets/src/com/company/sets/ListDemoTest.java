package com.company.sets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListDemoTest {
    public static void main(String[] args) {
        ListDemoAnnounce announce1 = new ListDemoAnnounce(1, "Welcome mooc!", "admin", new Date());
        ListDemoAnnounce announce2 = new ListDemoAnnounce(2, "Please submit in time", "teacher", new Date());
        ListDemoAnnounce announce3 = new ListDemoAnnounce(3, "Check-in", "teacher", new Date());

        ArrayList<ListDemoAnnounce> list = new ArrayList<>();
        list.add(announce1);
        list.add(announce2);
        list.add(announce3);
        System.out.println(list);
//        printListInfo(list);

        // 在第一条后面加新公告
        ListDemoAnnounce announce4 = new ListDemoAnnounce(4, "NEW: Contact Manager", "admin", new Date());
        list.add(1, announce4); // 添加在index为1的位置
//        printListInfo(list);

        // 删除按时完成作业的公告
        list.remove(announce2); // or list.remove(2);
//        printListInfo(list);

        // 更改Contact Manager并将它设置在第二条
        announce4.setTitle("NEW: Java-Try Online");
        list.set(1, announce4);
        printListInfo(list);
    }

    public static void printListInfo(List<ListDemoAnnounce> list) {
        for (ListDemoAnnounce output :
                list) {
            output.info();
        }
    }
}

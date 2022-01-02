package com.company.sets;

import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo {

    public static void main(String[] args) {
        // List是元素有序并且可以重复的集合
        // ArrayList extends List: 适合查找和更新，元素可以为null
        ArrayList<String> arrayList = new ArrayList<>();
        String[] name = {"Java", "Python", "C", "Go", "C++"};
        // 将name中的数据全部加入到arrayList
        arrayList.addAll(Arrays.asList(name));
        System.out.println("ArrayList元素个数：" + arrayList.size());
        System.out.println("取第5个：" + arrayList.get(4));
        // 删除C++
        arrayList.remove(4);
        System.out.println("删掉C++之后："+arrayList);
        // 是否包含C
        System.out.println("包含C吗？" + arrayList.contains("C"));
    }
}

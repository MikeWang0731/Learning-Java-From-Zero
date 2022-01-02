package com.company.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        // Set的元素无序且不可以重复
        // HashSet extends Set: 只允许一个Null元素
        // 良好的存取和查找，底层HashMap
        String[] color = {"blue", "red", "black", "yellow", "white"};
        HashSet<String> set = new HashSet<>();
        // 将数组转变成一个List用于加入set
        set.addAll(Arrays.asList(color));
        System.out.println("Set中的元素有：" + set);
        // Iterator迭代器：以一种统一的方式对各种集合进行遍历
        Iterator<String> iterator = set.iterator();
        System.out.println("使用迭代器进行遍历:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        // 插入一个新词汇
        set.add("green");

    }
}

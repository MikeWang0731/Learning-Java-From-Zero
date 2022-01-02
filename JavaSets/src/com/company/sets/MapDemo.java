package com.company.sets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    // Map中的数据以key-value存储
    // 键值对以Entry类型的对象实例存在
    // 可以通过key快速找到value
    // key必须唯一，value可以重复
    // 每个key只能对于一个value，但一个value可以对应多个key

    // HashMap extends Map based on hash table
    // 允许使用null-key和null-value
    // 无序排列

    public static void main(String[] args) {
        HashMap<String, String> animalDict = new HashMap();
        System.out.println("请输入三组单词：");
        Scanner input = new Scanner(System.in);
        // 添加数据
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个key值");
            String userInput = input.next();
            System.out.println("请输入第" + (i + 1) + "个value值");
            String userInput2 = input.next();
            animalDict.put(userInput, userInput2);
        }
        System.out.println("========================");

        // 打印输出value的值，使用迭代器
        System.out.println("输出所有的value");
        Iterator<String> iterator = animalDict.values().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        System.out.println("========================");

        //打印输出key的值
        System.out.println("输出所有key");
        for (Map.Entry<String, String> item :
                animalDict.entrySet()) {
            // getKey() & getValue()
            System.out.print("[key=" + item.getKey() + ", value=" + item.getValue() + "]  ");
        }
        System.out.println();
        System.out.println("========================");
    }
}

package com.company.sets;

import java.util.HashSet;
import java.util.Iterator;

public class SetAnimalTest {
    public static void main(String[] args) {
        SetAnimalManage cat1 = new SetAnimalManage("花花", 12, "英短");
        SetAnimalManage cat2 = new SetAnimalManage("凡凡", 3, "田园");

        HashSet<SetAnimalManage> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);

        // 除了迭代器，还可以使用增强for循环
        for (SetAnimalManage animal :
                set) {
            System.out.println(animal.toString());
        }

        // 添加一个和花花属性一样的猫
        SetAnimalManage cat3 = new SetAnimalManage("花花", 12, "英短");
        set.add(cat3);
        System.out.println("===================");
        System.out.println("添加新相同数据后：");
        // 因为他们的内存地址不一样，所以set不认为他们是相同数据
        // 当Manage.java中重写了hashCode()和equals()方法之后，就可以实现重复类(内容)的判断
//        for (SetAnimalManage animal :
//                set) {
//            System.out.println(animal.toString());
//        }

        // 插入牛牛
        SetAnimalManage cat4 = new SetAnimalManage("牛牛", 2, "英短");
        set.add(cat4);
        for (SetAnimalManage animal :
                set) {
            System.out.println(animal.toString());
        }

        // 查找花花的信息并输出
        System.out.println("花花存在吗？" + set.contains(cat4));
        // 使用猫的名字进行查找
        Iterator<SetAnimalManage> cat = set.iterator();
        while (cat.hasNext()) {
            if (cat.next().getName().equals("花花")) {
                System.out.println("找到了花花！");
                break;
            }
        }

        // 删除牛牛
        set.removeIf(animal -> "牛牛".equals(animal.getName()));
        System.out.println("===================");
        System.out.println("删除牛牛后：");
        for (SetAnimalManage animal :
                set) {
            System.out.println(animal.toString());
        }

        // 删除所有元素
        set.removeAll(set);
        System.out.println("===================");
        System.out.println("都删除了吗？" + set.isEmpty());
    }
}

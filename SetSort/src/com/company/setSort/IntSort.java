package com.company.setSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {

    public static void main(String[] args) {
        // 对list中的int数据进行排序
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, 3, 2, 5, 4, 9, 7};
        for (int item :
                arr) {
            list.add(item);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println("排序后：" + list);
    }
}

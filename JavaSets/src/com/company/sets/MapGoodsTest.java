package com.company.sets;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapGoodsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, MapGoods> goodsHashMap = new HashMap<>();
        System.out.println("请输入三条商品信息");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "条商品信息");
            System.out.println("请输入id：");
            String id = input.next();
            // 判断id(key)是否存在
            if (goodsHashMap.containsKey(id)) {
                System.out.println("商品id重复，请重新输入！");
                i--;
            } else {
                System.out.println("请输入商品名称：");
                String name = input.next();
                System.out.println("请输入价格：");
                double price = 0; // 这里需要初始化！！
                try {
                     price = input.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("输入格式有误");
                    input.next();  // 因为输入错误了一个，所以会激活重新输入
                    // 为了不影响正常的输入，这里我们设定一个空的"接收"来处理这个问题
                }
                goodsHashMap.put(id, new MapGoods(id, name, price));
            }
        }

        System.out.println("输出商品信息");
        for (Map.Entry<String, MapGoods> item :
                goodsHashMap.entrySet()) {
            System.out.println("Product ID: " + item.getKey());
            System.out.println(item.getValue().toString());
            System.out.println("================");
        }
    }
}

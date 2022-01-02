package CompareTwo;

import java.util.ArrayList;
import java.util.Collections;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("001", "paper", 1.05);
        Goods goods2 = new Goods("002", "apple", 0.75);
        Goods goods3 = new Goods("003", "bulb", 6.99);

        ArrayList<Goods> list = new ArrayList<>();
        list.add(goods1);
        list.add(goods2);
        list.add(goods3);

        System.out.println("排序前：");
        for (Goods item :
                list) {
            System.out.println(item);
        }
        System.out.println("===================");

        System.out.println("按价格排序降序后");
        Collections.sort(list);
        for (Goods item :
                list) {
            System.out.println(item);
        }
        System.out.println("===================");
    }
}

package Compare;

import java.util.ArrayList;
import java.util.Collections;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("huahua", 5, "英短");
        Cat fanfan = new Cat("fanfan", 2, "田园");
        Cat maomao = new Cat("maomao", 3, "田园");

        ArrayList<Cat> list = new ArrayList<>();
        list.add(huahua);
        list.add(fanfan);
        list.add(maomao);

        // 输出排序前
        System.out.println("排序前：");
        for (Cat cat :
                list) {
            System.out.println(cat);
        }
        System.out.println("=====================");

        // 按名字进行排序
        System.out.println("按名字升序排序后");
        list.sort(new NameComparator());  // 通过我们定义的NameComparator进行排序
        for (Cat cat :
                list) {
            System.out.println(cat);
        }
        System.out.println("=====================");

        // 按年龄降序排序
        System.out.println("按年龄降序排序后");
        list.sort(new AgeComparator());
        for (Cat cat :
                list) {
            System.out.println(cat);
        }
        System.out.println("=====================");
    }
}

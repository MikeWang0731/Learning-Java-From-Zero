package Compare;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {
    // 实现对Cat类型的比较，所以用Cat替代泛型位置
    @Override
    public int compare(Cat o1, Cat o2) {
        // 按名字升序排序
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
        // name2.compareTo(name1)->降序
    }
}

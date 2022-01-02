package Compare;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        // 按年龄降序排序
        int age1 = o1.getMonth();
        int age2 = o2.getMonth();
        // 如果o1>o2,则返回值为负数，刚好与标准相反
        // 这样，越小就越"正"，越"大"，就实现了降序
        return age2 - age1;
    }
}

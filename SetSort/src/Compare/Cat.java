package Compare;

import java.util.Objects;

public class Cat {
    // Comparator可以强行对某个对象进行整体排序
    // Comparator包含两个待比较对象->int compare(o1, o2)
    // o1<o2: 返回负数, o1=o2: 返回0, o1>o2: 返回正数
    private String name;
    private int month;
    private String species;

    public Cat() {

    }

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "名字：" + getName() + ", 年龄：" + getMonth() + " month, 品种：" + getSpecies();
    }
}

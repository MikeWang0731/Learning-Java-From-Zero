package com.company.sets;

import java.util.Objects;

public class SetAnimalManage {
    private String name;
    private int month;
    private String species;

    public SetAnimalManage() {

    }

    public SetAnimalManage(String name, int month, String species) {
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

    @Override
    public boolean equals(Object o) {
        // 如果当前对象等于传入对象，返回true
        if (this == o) return true;
        // 如果当前对象为空或者类名不一样，返回false
        if (o == null || getClass() != o.getClass()) return false;
        // if (o.getClass() == SetAnimalManage.class)
        SetAnimalManage that = (SetAnimalManage) o;
        // 返回所有内部元素是否相等
        return month == that.month && Objects.equals(name, that.name) && Objects.equals(species, that.species);
    }

    @Override
    // 相当于按照一个规则将数据放进不同的桶里
    public int hashCode() {
        return Objects.hash(name, month, species);
    }
}

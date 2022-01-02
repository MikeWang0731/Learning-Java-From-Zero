package com.company.sets;

public class MapGoods {
    private String id;
    private String name;
    private double price;

    public MapGoods() {
    }

    public MapGoods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("商品信息如下\n");
        builder.append("ID: ").append(getId());
        builder.append("  Name: ").append(getName());
        builder.append("  Price: ").append(getPrice());
        return builder.toString();
    }
}

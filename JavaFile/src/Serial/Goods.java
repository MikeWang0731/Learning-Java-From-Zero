package Serial;

import java.io.Serializable;

public class Goods implements Serializable {
    private String goodsID;
    private String goodsName;
    private double price;

    public Goods() {

    }

    public Goods(String goodsID, String goodsName, double price) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.price = price;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("商品信息如下：\n");
        builder.append("ID: " + getGoodsID() + "\n");
        builder.append("Name: " + getGoodsName() + "\n");
        builder.append("Price: " + getPrice());
        return builder.toString();
    }
}

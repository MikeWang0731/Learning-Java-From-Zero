package CompareTwo;

public class Goods implements Comparable<Goods> {

    private String id;
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String id, String name, double price) {
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

    @Override
    public int compareTo(Goods o) {
        // 取商品价格
        double priceThis = this.getPrice();
        double priceAnother = o.getPrice();
        // 原本: 当前-传入>0,前者大于后者, 返回正数, 大的靠后, 符合默认升序
        // 现在：当前-传入>0,前者大于后者, 返回负数, 大的靠前, 符合降序排列
        return (priceThis - priceAnother) > 0 ? -1 : 1;
    }
}

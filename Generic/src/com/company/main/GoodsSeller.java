package com.company.main;

import java.util.List;

public class GoodsSeller {
    // <? extends Goods> -> Goods以及它的子类都可以
    // List接受的类型是: <一个什么东西 extends Goods>
    public void sellGoods(List<? extends Goods> goods) {
        // 调用集合中的sell方法
        for (Goods good :
                goods) {
            good.sell();
        }
    }
}

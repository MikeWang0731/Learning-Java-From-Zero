package com.company.main;

public class Book extends Goods {

    @Override
    public void sell() {
        System.out.println("卖了一本书！");
    }
}

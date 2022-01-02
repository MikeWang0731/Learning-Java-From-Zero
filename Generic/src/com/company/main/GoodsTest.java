package com.company.main;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());

        GoodsSeller seller = new GoodsSeller();
        seller.sellGoods(books);
    }
}

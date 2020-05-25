package com.andrzejPek.templates;

public enum Additives {

    chesse(3),ham(5),mashrooms(4),chesseMozzarella(5),bazil(2),pepper(4),salami(6),pineapple(4),onion(3),anchois(8),capers(6);

    private int price;

    private Additives(int price){this.price = price;}

    public int getPrice() {
        return price;
    }
}

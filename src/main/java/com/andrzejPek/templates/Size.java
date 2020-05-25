package com.andrzejPek.templates;

public enum Size {
    small(25),average(35),big(42);

    private int size;

    private Size(int size){this.size = size;}

    public int getSize() {
        return size;
    }
}

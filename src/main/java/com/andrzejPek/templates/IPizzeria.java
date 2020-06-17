package com.andrzejPek.templates;

import com.andrzejPek.implementation.Pizza;

public interface IPizzeria {

    public void showMenu();
    public String getName();
    public IPizza orderPizza(IPizza pizza,Size size);
}

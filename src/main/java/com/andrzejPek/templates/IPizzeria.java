package com.andrzejPek.templates;

import com.andrzejPek.implementation.Pizza;

public interface IPizzeria {

    public void showMenu();
    public String getName();
    public Pizza orderPizza(Pizza pizza,Size size);
}

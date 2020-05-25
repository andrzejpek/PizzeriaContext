package com.andrzejPek.templates;

public interface IPizzeria {

    public void showMenu();
    public IPizza orderPizza(String namePizza);
    public String getName();
}

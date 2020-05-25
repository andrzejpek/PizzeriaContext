package com.andrzejPek.implementation;

import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.IPizzeria;

public class Pizzeria implements IPizzeria {

    private String namePizzeria;
    @Override
    public void showMenu() {

    }

    @Override
    public IPizza orderPizza(String namePizza) {
        return null;
    }

    @Override
    public String getName() {
        return namePizzeria;
    }
}

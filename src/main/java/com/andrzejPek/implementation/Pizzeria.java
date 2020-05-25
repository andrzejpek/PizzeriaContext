package com.andrzejPek.implementation;

import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.IPizzeria;
import org.springframework.beans.factory.annotation.Autowired;

public class Pizzeria implements IPizzeria {

    private String namePizzeria;

    @Autowired
    private PizzaStart pizzaStart;
    @Autowired
    private PizzaCapricosa pizzaCapricosa;
    @Autowired
    private PizzaHawaiian pizzaHawaiian;
    @Autowired
    private PizzaItaly pizzaItaly;
    @Autowired
    private PizzaParma pizzaParma;
    @Autowired
    private PizzaPepperoni pizzaPepperoni;
    @Autowired
    private PizzaPeppeRosso pizzaPeppeRosso;

    public Pizzeria(String namePizzeria) {
        this.namePizzeria = namePizzeria;
    }

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

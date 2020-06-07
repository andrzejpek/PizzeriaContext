package com.andrzejPek.implementation;

import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.IPizzeria;
import com.andrzejPek.templates.Size;
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
    public String getName() {
        return namePizzeria;
    }

    @Override
    public Pizza orderPizza(Pizza pizza, Size size) {
        return pizza;
    }

    public Pizza orderPizza(Pizza pizza,Size size, Additives... additives){
        pizza.setAdditives(additives);
        pizza.setPrice(pizza.getPrice(),size);
        System.out.printf("Your pizza is %s Additives: %s cost is: %d %n",pizza.getName(),pizza.listAdditives,pizza.getPrice());
        return pizza;
    }
}

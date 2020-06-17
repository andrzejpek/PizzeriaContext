package com.andrzejPek.implementation;

import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.IPizzeria;
import com.andrzejPek.templates.Size;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class Pizzeria implements IPizzeria {

    private String namePizzeria;
    private ArrayList<Pizza> listPizza = new ArrayList();

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
        System.out.println("Menu");
        for (Pizza a : listPizza){
            System.out.println(a.name+" "+a.listAdditives+" "+a.getPrice());
        }
    }


    public void setListPizza(Pizza pizza) {
        listPizza.add(pizza);
        this.listPizza = listPizza;
    }


    @Override
    public String getName() {
        return namePizzeria;
    }

    @Override
    public IPizza orderPizza(IPizza pizza, Size size) {
        return pizza;
    }

    public IPizza orderPizza(IPizza pizza,Size size, Additives... additives){
        pizza.setAdditives(additives);
        pizza.setPrice(pizza.getPrice(),size);
        System.out.printf("Your pizza is %s Additives: %s cost is: %d %n",pizza.getName(),pizza.getAdditives(),pizza.getPrice());
        pizza.deleteAdditives(additives);
        return pizza;
    }
}

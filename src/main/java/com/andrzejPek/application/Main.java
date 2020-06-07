package com.andrzejPek.application;

import com.andrzejPek.config.Config;
import com.andrzejPek.implementation.*;
import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.Size;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Pizzeria pizzeria = context.getBean(Pizzeria.class);
        System.out.println(pizzeria.getName());

        Pizza pizzaPepperoni = context.getBean(PizzaPepperoni.class);
        Pizza pizzaCapricosa = context.getBean(PizzaCapricosa.class);
        Pizza pizzaHawaiian = context.getBean(PizzaHawaiian.class);
        Pizza pizzaItaly = context.getBean(PizzaItaly.class);
        Pizza pizzaParma = context.getBean(PizzaParma.class);
        Pizza pizzaPeppeRosso = context.getBean(PizzaPeppeRosso.class);
        Pizza pizzaStart = context.getBean(PizzaStart.class);
        pizzeria.showMenu();


    showAdditives();
    showSize();
    pizzeria.orderPizza(pizzaStart,Size.average,Additives.pineapple,Additives.capers);
    pizzeria.orderPizza(pizzaHawaiian,Size.big,Additives.mashrooms,Additives.pepper);
        System.out.println(pizzaStart.getAdditives());
        System.out.println(pizzaHawaiian.getAdditives()+""+pizzaHawaiian.getPrice());

    pizzeria.showMenu();
    }



    public static void showAdditives(){
        for (Additives d : Additives.values()){
            System.out.printf("Additives is %s and cost %d %n",d,d.getPrice());
        }
    }

    public static void showSize(){
        for (Size s : Size.values()){
            System.out.printf("size pizza %s is %d cm %n",s,s.getSize());
        }
    }
}

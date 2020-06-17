package com.andrzejPek.application;

import com.andrzejPek.config.Config;
import com.andrzejPek.implementation.*;
import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.Size;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Pizzeria pizzeria = context.getBean(Pizzeria.class);
        System.out.println(pizzeria.getName());

        IPizza pizzaPepperoni = context.getBean(PizzaPepperoni.class);
        IPizza pizzaCapricosa = context.getBean(PizzaCapricosa.class);
        IPizza pizzaHawaiian = context.getBean(PizzaHawaiian.class);
        IPizza pizzaItaly = context.getBean(PizzaItaly.class);
        IPizza pizzaParma = context.getBean(PizzaParma.class);
        IPizza pizzaPeppeRosso = context.getBean(PizzaPeppeRosso.class);
        IPizza pizzaStart = context.getBean(PizzaStart.class);
        pizzeria.showMenu();


        showAdditives();
        showSize();
        pizzeria.orderPizza(pizzaStart, Size.average, Additives.pineapple, Additives.capers);
        pizzeria.orderPizza(pizzaHawaiian, Size.big, Additives.mashrooms, Additives.pepper);
        System.out.println(pizzaStart.getAdditives());
        System.out.println(pizzaHawaiian.getAdditives() + "" + pizzaHawaiian.getPrice());

        pizzeria.showMenu();

        List <Double> doubleList = new ArrayList<>();
        Random random = new Random();
        var numbersElements = random.nextInt(20);
        double sum = 0;
        for (int i = 0 ; i <= numbersElements ; i++){
            doubleList.add(random.nextDouble()*10);
            sum+=doubleList.get(i);
        }
        System.out.println("Double list");
        System.out.println(doubleList);
        var avg = sum / doubleList.size();
        System.out.println("Arithmetic average is: "+avg);

        Collections.sort(doubleList);
        double median = doubleList.size()/2;
        if (doubleList.size()%2 == 0) {
            median = (doubleList.get(doubleList.size()/2) + doubleList.get(doubleList.size()/2 - 1))/2;
        } else {
            median = doubleList.get(doubleList.size() / 2);
        }

        System.out.println("Median is: "+median);

    }


    public static void showAdditives() {
        for (Additives d : Additives.values()) {
            System.out.printf("Additives is %s and cost %d %n", d, d.getPrice());
        }
    }

    public static void showSize() {
        for (Size s : Size.values()) {
            System.out.printf("size pizza %s is %d cm %n", s, s.getSize());
        }
    }


}

package com.andrzejPek.application;

import com.andrzejPek.config.Config;
import com.andrzejPek.implementation.PizzaPepperoni;
import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.IPizzeria;
import com.andrzejPek.templates.Size;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        IPizzeria pizzeria = context.getBean(IPizzeria.class);
        System.out.println(pizzeria.getName());

        IPizza pizza = context.getBean(PizzaPepperoni.class);
        System.out.println(pizza.getName()+" "+pizza.getPrice());


    showAdditives();
    showSize();
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

package com.andrzejPek.config;

import com.andrzejPek.implementation.*;
import com.andrzejPek.templates.Additives;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Pizzeria getPizzeria(){ return new Pizzeria("Forno"); }


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaHawaiian getPizzaHawaiian() {
        PizzaHawaiian pizzaHawaiian = new PizzaHawaiian();
        pizzaHawaiian.setName("Pizza Hawaiian");
        pizzaHawaiian.setAdditives(Additives.chesse,Additives.pineapple);
        getPizzeria().setListPizza(pizzaHawaiian);
        return pizzaHawaiian;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaCapricosa getPizzaCapricosa() {
        PizzaCapricosa pizzaCapricosa = new PizzaCapricosa();
        pizzaCapricosa.setName("Pizza Capricosa");
        pizzaCapricosa.setAdditives(Additives.chesse,Additives.ham,Additives.mashrooms);
        getPizzeria().setListPizza(pizzaCapricosa);
        return pizzaCapricosa;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaItaly getPizzaItaly() {
        PizzaItaly pizzaItaly = new PizzaItaly();
        pizzaItaly.setName("Pizza Italy");
        pizzaItaly.setAdditives(Additives.chesseMozzarella,Additives.anchois,Additives.onion,Additives.capers);
        getPizzeria().setListPizza(pizzaItaly);
        return pizzaItaly;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaParma getPizzaParma() {
        PizzaParma pizzaParma = new PizzaParma();
        pizzaParma.setName("Pizza Italy");
        pizzaParma.setAdditives(Additives.chesseMozzarella,Additives.bazil,Additives.ham);
        getPizzeria().setListPizza(pizzaParma);
        return pizzaParma;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaPepperoni getPizzaPepperoni() {
        PizzaPepperoni pizzaPepperoni = new PizzaPepperoni();
        pizzaPepperoni.setName("Pizza Pepperoni");
        pizzaPepperoni.setAdditives(Additives.chesse,Additives.pepper,Additives.salami);
        getPizzeria().setListPizza(pizzaPepperoni);
        return pizzaPepperoni;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaPeppeRosso getPizzaPeppeRosso() {
        PizzaPeppeRosso pizzaPeppeRosso = new PizzaPeppeRosso();
        pizzaPeppeRosso.setName("Pizza Italy");
        pizzaPeppeRosso.setAdditives(Additives.chesse,Additives.pepper,Additives.salami,Additives.bazil);
        getPizzeria().setListPizza(pizzaPeppeRosso);
        return pizzaPeppeRosso;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PizzaStart getPizzaStart() {
        PizzaStart pizzaStart = new PizzaStart();
        pizzaStart.setAdditives(Additives.chesse);
        pizzaStart.setName("Pizza Start");
        getPizzeria().setListPizza(pizzaStart);
        return pizzaStart;
    }
}

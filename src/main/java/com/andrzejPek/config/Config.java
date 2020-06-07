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
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaHawaiian getPizzaHawaiian() {
        PizzaHawaiian pizzaHawaiian = new PizzaHawaiian();
        pizzaHawaiian.setName("Pizza Hawaiian");
        pizzaHawaiian.setAdditives(Additives.chesse,Additives.pineapple);
        return pizzaHawaiian;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaCapricosa getPizzaCapricosa() {
        PizzaCapricosa pizzaCapricosa = new PizzaCapricosa();
        pizzaCapricosa.setName("Pizza Capricosa");
        pizzaCapricosa.setAdditives(Additives.chesse,Additives.ham,Additives.mashrooms);
        return pizzaCapricosa;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaItaly getPizzaItaly() {
        PizzaItaly pizzaItaly = new PizzaItaly();
        pizzaItaly.setName("Pizza Italy");
        pizzaItaly.setAdditives(Additives.chesseMozzarella,Additives.anchois,Additives.onion,Additives.capers);
        return pizzaItaly;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaParma getPizzaParma() {
        PizzaParma pizzaParma = new PizzaParma();
        pizzaParma.setName("Pizza Italy");
        pizzaParma.setAdditives(Additives.chesseMozzarella,Additives.bazil,Additives.ham);
        return pizzaParma;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaPepperoni getPizzaPepperoni() {
        PizzaPepperoni pizzaPepperoni = new PizzaPepperoni();
        pizzaPepperoni.setName("Pizza Pepperoni");
        pizzaPepperoni.setAdditives(Additives.chesse,Additives.pepper,Additives.salami);
        return pizzaPepperoni;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaPeppeRosso getPizzaPeppeRosso() {
        PizzaPeppeRosso pizzaPeppeRosso = new PizzaPeppeRosso();
        pizzaPeppeRosso.setName("Pizza Italy");
        pizzaPeppeRosso.setAdditives(Additives.chesse,Additives.pepper,Additives.salami,Additives.bazil);
        return pizzaPeppeRosso;
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PizzaStart getPizzaStart() {
        PizzaStart pizzaStart = new PizzaStart();
        pizzaStart.setAdditives(Additives.chesse);
        pizzaStart.setName("Pizza Start");
        return pizzaStart;
    }
}

package com.andrzejPek.implementation;

import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.Size;

import java.util.ArrayList;


public abstract class Pizza implements IPizza {

    protected String name;
    protected Size size;
    protected int price = 15;
    protected ArrayList<Additives> listAdditives = new ArrayList<>();

    @Override
    public ArrayList<Additives> getAdditives() {
        return listAdditives;
    }

    @Override
    public void setAdditives(Additives... additives) {
        for (Additives a : additives)
        listAdditives.add(a);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setPrice(int price,Size size) {
        for (Additives a : listAdditives) {
            price += a.getPrice();
        }
        if (size == Size.average){
            price += 5;
        }else if (size == Size.big)
            price += 8;

        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
}

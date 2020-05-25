package com.andrzejPek.implementation;

import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.IPizza;
import com.andrzejPek.templates.Size;

import java.util.ArrayList;


public abstract class Pizza implements IPizza {

    protected String name;
    protected Size size;
    protected int price;
    protected ArrayList<Additives> listAdditives;

    @Override
    public ArrayList<Additives> getAdditives() {
        return listAdditives;
    }

    @Override
    public void setAdditives(Additives... additives) {
        listAdditives = new ArrayList<>();
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
    public void setPrice(int price) {
        for (Additives a : listAdditives) {
            price += a.getPrice();
        }
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

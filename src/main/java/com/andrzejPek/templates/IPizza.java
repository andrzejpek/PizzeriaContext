package com.andrzejPek.templates;

import java.util.List;

public interface IPizza {
    public int getPrice();
    public String getName();
    public Size getSize();
    public List<Additives> getAdditives();

    public void setPrice(int price);
    public void setName(String name);
    public void setSize(Size size);
    public void setAdditives(Additives... additives);
}

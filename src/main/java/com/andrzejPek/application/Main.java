package com.andrzejPek.application;

import com.andrzejPek.templates.Additives;
import com.andrzejPek.templates.Size;

public class Main {
    public static void main(String[] args) {

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

package com.AbstractFactory.products.trousers;

import com.AbstractFactory.products.Trousers;

public class GalaTrousers implements Trousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones de gala -- Tienen bolsillos? --> Si");
        return true;
    }

    @Override
    public String getClosuretype() {
        System.out.println("Pantalones de gala -- Tipo de cierre? --> cremallera");
        return "cremallera";
    }
}

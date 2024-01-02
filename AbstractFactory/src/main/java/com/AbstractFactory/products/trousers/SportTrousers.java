package com.AbstractFactory.products.trousers;

import com.AbstractFactory.products.Trousers;

public class SportTrousers implements Trousers {
    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones deportivos -- Tienen bolsillos? --> No");
        return false;
    }

    @Override
    public String getClosuretype() {
        System.out.println("Pantalones deportivos -- Tipo de cierre? --> Sin cierre");
        return null;
    }
}

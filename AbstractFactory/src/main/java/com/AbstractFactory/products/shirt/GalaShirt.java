package com.AbstractFactory.products.shirt;

import com.AbstractFactory.products.Shirt;

public class GalaShirt implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva -- Tiene mangas largas? --> Si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva -- Tiene botones? --> Si");
        return true;
    }
}

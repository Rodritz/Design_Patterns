package com.AbstractFactory.factories;

import com.AbstractFactory.ClothesFactory;
import com.AbstractFactory.products.Shirt;
import com.AbstractFactory.products.Shoe;
import com.AbstractFactory.products.Trousers;
import com.AbstractFactory.products.shirt.SportShirt;
import com.AbstractFactory.products.shoe.SportShoe;
import com.AbstractFactory.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}

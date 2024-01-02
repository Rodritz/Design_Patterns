package com.AbstractFactory.factories;

import com.AbstractFactory.ClothesFactory;
import com.AbstractFactory.products.Shirt;
import com.AbstractFactory.products.Shoe;
import com.AbstractFactory.products.Trousers;
import com.AbstractFactory.products.shirt.GalaShirt;
import com.AbstractFactory.products.shoe.GalaShoe;
import com.AbstractFactory.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}

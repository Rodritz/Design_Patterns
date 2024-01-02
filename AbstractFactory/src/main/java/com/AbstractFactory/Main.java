package com.AbstractFactory;

import com.AbstractFactory.factories.GalaClothesFactory;
import com.AbstractFactory.factories.SportClothesFactory;
import com.AbstractFactory.products.Shirt;
import com.AbstractFactory.products.shirt.GalaShirt;
import com.AbstractFactory.products.shoe.GalaShoe;
import com.AbstractFactory.products.shoe.SportShoe;
import com.AbstractFactory.products.trousers.GalaTrousers;
import com.AbstractFactory.products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {

        //Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory =  new SportClothesFactory();
        Shirt sportShirt = sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes(); //como especifico el tipo de clase luego me pide el casteo
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();

        System.out.println("\n---> Ejemplo de ropa deportiva <---");
        sportShirt.hasButtons();
        sportTrousers.getClosuretype();
        sportShoe.isRunningShoes();

        //Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();
        GalaShirt galashirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();

        System.out.println("\n---> Ejemplo de ropa de gala <---");
        galashirt.hasButtons();
        galaTrousers.getClosuretype();
        galaShoe.isRunningShoes();
    }
}
package com.AbstractFactory;

import com.AbstractFactory.products.Shirt;
import com.AbstractFactory.products.Shoe;
import com.AbstractFactory.products.Trousers;

public interface ClothesFactory { //creamos la abstractFactory que va a variar el nombre segun lo que vayamos a crear

    Shoe createShoes();
    Shirt createShirt();
    Trousers createTrousers();
}

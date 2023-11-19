package com.Prototype;

import com.Prototype.prototype.PriceList;
import com.Prototype.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de precios inicial
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(new Product("Computadora", 650000),
                new Product("Mouse", 120000),
                new Product("Teclado", 80000),
                new Product("Pantalla", 1350000),
                new Product("Auriculares", 40000));
        priceList.setProductList(productList);

        System.out.println(priceList);

        // Primera lista de precios Clone Simple - los objetos de la lista tienen la misma referencia en memoria porque son el mismo objeto
        PriceList priceList1 = (PriceList) priceList.clone();
        priceList1.setName("Lista Clone Simple");

        System.out.println(priceList1);

        // Segunda lista de precios Clone Profundo - los objetos de la lista tienen diferente referencia en memoria porque son objetos diferentes
        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList1.setName("Lista Clone Profundo");

        System.out.println(priceList2);

        // Tercera lista de precios con descuento - Clone profundo
        /*CUIDADO--- si realizamos un clone simple y modificamos precios,
        tambien terminamos modificando los precios de la lista inicial */
        PriceList priceList3 = (PriceList) priceList.deepClone();
        priceList3.setName("Lista Prefer");

        for (Product product : priceList3.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList3);
        System.out.println(priceList);

        // Cuarta lista de precios con descuento - Clone profundo
        /*CUIDADO--- si realizamos un clone simple y modificamos precios,
        tambien terminamos modificando los precios de la lista inicial */
        PriceList priceList4 = (PriceList) priceList.deepClone();
        priceList4.setName("Lista VIP");

        for (Product product : priceList4.getProductList()){
            product.setPrice(product.getPrice() * 0.5);
        }

        System.out.println(priceList4);
    }
}
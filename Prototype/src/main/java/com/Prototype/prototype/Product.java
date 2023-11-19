package com.Prototype.prototype;

public class Product implements IPrototype{

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        Product clone = new Product(this.name, this.price);
        return clone;
    }

    /*aca no necesitamos un deepClone porque Product no tiene objetos relacionados por lo cual si se
    llamara a deepClone llamamos a clone()*/
    @Override
    public IPrototype deepClone() {
        return clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //modificamos el metodo toString para que nos imprima la referencia en memoria del objeto actual
    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " - Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

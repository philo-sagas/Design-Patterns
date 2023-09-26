package com.gof.creational.builder.example;

public class ClientBuilder {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getProduct();
        System.out.printf("The product's object is %s.\n", product);
    }
}

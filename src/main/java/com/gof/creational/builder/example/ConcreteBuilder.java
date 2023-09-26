package com.gof.creational.builder.example;

public class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartA(String data) {
        this.product.setDataA(data);
    }

    @Override
    public void buildPartB(String data) {
        this.product.setDataB(data);
    }

    @Override
    public void buildPartC(String data) {
        this.product.setDataC(data);
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}

package com.gof.creational.builder.example;

public interface Builder {
    void buildPartA(String data);

    void buildPartB(String data);

    void buildPartC(String data);

    Product getProduct();
}

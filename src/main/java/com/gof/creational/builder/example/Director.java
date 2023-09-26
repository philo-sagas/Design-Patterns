package com.gof.creational.builder.example;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        System.out.println("Director construct Part A.");
        this.builder.buildPartA("PartA");
        System.out.println("Director construct Part B.");
        this.builder.buildPartB("PartB");
        System.out.println("Director construct Part C.");
        this.builder.buildPartC("PartC");
    }
}

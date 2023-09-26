package com.gof.creational.builder.example;

public class Product {
    private String dataA;

    private String dataB;

    private String dataC;

    public String getDataA() {
        return dataA;
    }

    public void setDataA(String dataA) {
        this.dataA = dataA;
    }

    public String getDataB() {
        return dataB;
    }

    public void setDataB(String dataB) {
        this.dataB = dataB;
    }

    public String getDataC() {
        return dataC;
    }

    public void setDataC(String dataC) {
        this.dataC = dataC;
    }

    @Override
    public String toString() {
        return String.format("Product { dataA = '%s', dataB = '%s', dataC = '%s' }", this.dataA, this.dataB, this.dataC);
    }
}

package com.gof.structural.composite.example;

public class ClientComposite {
    public static void main(String[] args) {
        Composite compositeA = new Composite();
        Composite compositeB = new Composite();
        Leaf leafA = new Leaf();
        Leaf leafB = new Leaf();
        Leaf leafC = new Leaf();
        compositeB.add(leafB);
        compositeB.add(leafC);
        compositeA.add(leafA);
        compositeA.add(compositeB);
        Component root = compositeA;
        root.operate();
        System.out.printf("The leafA's parent component is %s.\n", leafA.getParent());
        System.out.printf("The leafB's parent component is %s.\n", leafB.getParent());
        System.out.printf("The leafC's parent component is %s.\n", leafC.getParent());
    }
}

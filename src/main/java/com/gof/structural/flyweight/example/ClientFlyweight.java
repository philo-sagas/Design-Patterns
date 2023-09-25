package com.gof.structural.flyweight.example;

public class ClientFlyweight {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        Flyweight flyweightA1 = flyweightFactory.getFlyweight("A");
        Flyweight flyweightA2 = flyweightFactory.getFlyweight("A");
        Flyweight flyweightB = flyweightFactory.getFlyweight("B");
        Flyweight flyweightC = flyweightFactory.getFlyweight("C");
        Flyweight flyweightOther = flyweightFactory.getFlyweight("Other");
        System.out.printf("The flyweightA1's object is %s.\n", flyweightA1);
        System.out.printf("The flyweightA2's object is %s.\n", flyweightA2);
        flyweightA1.operate("1.1");
        flyweightA2.operate("1.2");
        flyweightB.operate("2");
        flyweightC.operate("3");
        flyweightOther.operate("9");
    }
}

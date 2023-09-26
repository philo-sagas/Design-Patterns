package com.gof.creational.singleton.example;

public class ClientSingleton {
    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();
        singletonA.setData("Data");
        System.out.printf("The singletonA's object is %s with one data '%s'.\n", singletonA, singletonA.getData());
        System.out.printf("The singletonB's object is %s with one data '%s'.\n", singletonB, singletonB.getData());
        SingletonEnum.SINGLETON.operate();
    }
}

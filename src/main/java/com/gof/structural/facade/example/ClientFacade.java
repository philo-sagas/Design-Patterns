package com.gof.structural.facade.example;

public class ClientFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operate();
    }
}

package com.gof.structural.proxy.example;

public class ClientProxy {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new Proxy(realSubject);
        subject.request();
    }
}

package com.gof.behavioral.template_method.example;

public class ClientTemplateMethod {
    public static void main(String[] args) {
        AbstractClass templateClass = new ConcreteClass();
        templateClass.templateMethod();
    }
}

package com.gof.behavioral.iterator.example;

public class ClientIterator {
    public static void main(String[] args) {
        String[] data = {"A", "B", "C", "D", "E", "F", "G"};
        Aggregate<String> aggregate = new ConcreteAggregate<>(data);
        Iterator<String> iterator = aggregate.createIterator();
        for (iterator.first(); iterator.isDone(); iterator.next()) {
            System.out.printf("The aggregate's item: %s\n", iterator.currentItem());
        }
    }
}

package com.gof.behavioral.iterator.example;

public class ConcreteAggregate<T> implements Aggregate<T> {
    T[] data;

    public ConcreteAggregate(T[] data) {
        this.data = data;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}

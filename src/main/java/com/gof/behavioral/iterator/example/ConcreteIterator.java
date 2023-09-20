package com.gof.behavioral.iterator.example;

public class ConcreteIterator<T> implements Iterator<T> {
    private ConcreteAggregate<T> aggregate;

    private int index;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
        this.index = -1;
    }

    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public void next() {
        this.index++;
    }

    @Override
    public boolean isDone() {
        return this.index < this.aggregate.data.length;
    }

    @Override
    public T currentItem() {
        return this.aggregate.data[this.index];
    }
}

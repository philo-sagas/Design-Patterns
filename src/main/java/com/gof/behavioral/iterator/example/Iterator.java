package com.gof.behavioral.iterator.example;

public interface Iterator<T> {
    void first();

    void next();

    boolean isDone();

    T currentItem();
}

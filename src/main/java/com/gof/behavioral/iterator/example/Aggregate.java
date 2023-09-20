package com.gof.behavioral.iterator.example;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}

package com.gof.structural.composite.example;

public interface Component {
    void operate();

    default void add(Component component) {
        // default
    }

    default void remove(Component component) {
        // default
    }

    default Component getChild(int index) {
        // default
        return null;
    }

    default Component getParent() {
        // default
        return null;
    }

    default void setParent(Component parent) {
        // default
    }
}

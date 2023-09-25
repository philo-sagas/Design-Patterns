package com.gof.structural.composite.example;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children;

    public Composite() {
        this.children = new LinkedList<>();
    }

    @Override
    public void operate() {
        System.out.println("Composite invoke the children's operate method.");
        this.children.stream().forEach(component -> component.operate());
    }

    @Override
    public void add(Component component) {
        component.setParent(this);
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
        component.setParent(null);
    }

    @Override
    public Component getChild(int index) {
        return this.children.get(index);
    }
}

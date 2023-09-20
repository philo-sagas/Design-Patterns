package com.gof.behavioral.visitor.example;

import java.util.List;

public class ObjectStructure {
    private List<Element> elements;

    private ObjectStructure parent;

    public ObjectStructure(List<Element> elements) {
        this(elements, null);
    }

    public ObjectStructure(List<Element> elements, ObjectStructure parent) {
        this.elements = elements;
        this.parent = parent;
    }

    public void accept(Visitor visitor) {
        if (this.parent != null) {
            this.parent.accept(visitor);
        }
        this.elements.stream().forEach(element -> element.accept(visitor));
    }
}

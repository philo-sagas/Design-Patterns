package com.gof.behavioral.interpreter.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Context {
    private Set<String> data;

    public Context() {
        data = new LinkedHashSet<>();
    }

    public boolean lookup(String key) {
        return data.contains(key);
    }

    public void assign(String key, boolean value) {
        if (value) {
            data.add(key);
        } else {
            data.remove(key);
        }
    }
}

package com.gof.structural.flyweight.example;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FlyweightFactory {
    private static FlyweightFactory INSTANCE = new FlyweightFactory();

    public static FlyweightFactory getInstance() {
        return INSTANCE;
    }

    private static final Set<String> SHARED_KEYS = new HashSet<>();

    static {
        SHARED_KEYS.add("A");
        SHARED_KEYS.add("B");
        SHARED_KEYS.add("C");
    }

    private Map<String, Flyweight> flyweights;

    private FlyweightFactory() {
        this.flyweights = new LinkedHashMap<>();
    }

    public Flyweight getFlyweight(String key) {
        if (SHARED_KEYS.contains(key)) {
            if (!this.flyweights.containsKey(key)) {
                synchronized (FlyweightFactory.class) {
                    if (!this.flyweights.containsKey(key)) {
                        this.flyweights.put(key, new ConcreteFlyweight(key));
                    }
                }
            }
            return this.flyweights.get(key);
        } else {
            return new UnsharedConcreteFlyweight(key);
        }
    }
}

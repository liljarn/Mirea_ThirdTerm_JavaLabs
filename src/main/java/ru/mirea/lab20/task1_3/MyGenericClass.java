package ru.mirea.lab20.task1_3;

import java.io.Serializable;

public class MyGenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private final T t;
    private final V v;
    private final K k;

    public MyGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("T class name: " + t.getClass().getName());
        System.out.println("V class name: " + v.getClass().getName());
        System.out.println("K class name: " + k.getClass().getName());
    }
}
package ru.mirea.lab23.task1;

public abstract class AbstractQueue implements Queue {
    abstract public void enqueue(Object element);

    abstract public Object element();

    abstract public Object dequeue();

    abstract public int size();

    abstract public boolean isEmpty();

    abstract public void clear();
}

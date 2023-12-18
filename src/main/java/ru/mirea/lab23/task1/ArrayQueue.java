package ru.mirea.lab23.task1;

public class ArrayQueue extends AbstractQueue{
    private final Object[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayQueue() {
        queue = new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(Object item) {
        if (size != DEFAULT_CAPACITY) {
            rear = (rear + 1) % DEFAULT_CAPACITY;
            queue[rear] = item;
            size++;
        } else {
            throw new IllegalStateException("Queue is full.");
        }
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        else {
            return queue[front];
        }
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object item = queue[front];
        front = (front + 1) % DEFAULT_CAPACITY;
        size--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            return;
        }

        for (int i = 0; i < size(); i++) {
            queue[i] = null;
        }

        rear = -1;
        front = 0;
    }
}
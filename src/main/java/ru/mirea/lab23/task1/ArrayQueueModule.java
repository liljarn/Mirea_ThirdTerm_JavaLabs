package ru.mirea.lab23.task1;

public class ArrayQueueModule {
    private static ArrayQueueModule instance;
    private static Object[] queue;
    private static int front;
    private static int rear;
    private static int size;
    private static final int DEFAULT_CAPACITY = 10;

    private ArrayQueueModule() {
        queue = new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public static ArrayQueueModule getInstance() {
        if (instance == null) {
            instance = new ArrayQueueModule();
        }
        return instance;
    }

    public void enqueue(int item) {
        if (size != DEFAULT_CAPACITY) {
            rear = (rear + 1) % DEFAULT_CAPACITY;
            queue[rear] = item;
            size++;
        } else {
            throw new IllegalStateException("Queue is full.");
        }
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        else {
            return queue[front];
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object item = queue[front];
        front = (front + 1) % DEFAULT_CAPACITY;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

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
package ru.mirea.lab23.task1;

public class ArrayQueueADT {
    private final Object[] array;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayQueueADT() {
        array = new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public static void enqueue(ArrayQueueADT queue, int item) {
        if (queue.size != DEFAULT_CAPACITY) {
            queue.rear = (queue.rear + 1) % DEFAULT_CAPACITY;
            queue.array[queue.rear] = item;
            queue.size++;
        } else {
            throw new IllegalStateException("Queue is full.");
        }
    }

    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty.");
        }
        else {
            return queue.array[queue.front];
        }
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object item = queue.array[queue.front];
        queue.front = (queue.front + 1) % DEFAULT_CAPACITY;
        queue.size--;
        return item;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static void clear(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            return;
        }

        for (int i = 0; i < size(queue); i++) {
            queue.array[i] = null;
        }

        queue.rear = -1;
        queue.front = 0;
    }
}
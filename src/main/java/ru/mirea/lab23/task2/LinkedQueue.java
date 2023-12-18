package ru.mirea.lab23.task2;

import ru.mirea.lab23.task1.AbstractQueue;

public class LinkedQueue extends AbstractQueue {
    private Node front;
    private Node rear;

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enqueue(Object data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return front.data;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public void clear() {
        while (front != null) {
            Node next = front.next;
            front.next = null;
            front = next;
        }
        rear = null;
    }
}
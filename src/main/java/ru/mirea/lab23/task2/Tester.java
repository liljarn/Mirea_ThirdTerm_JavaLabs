package ru.mirea.lab23.task2;

import ru.mirea.lab23.task1.AbstractQueue;

public class Tester {
    public static void main(String[] args) {
        System.out.println("- - - > Тестирование LinkedQueue (и AbstractQueue)");
        AbstractQueue linkedQueue = new LinkedQueue();
        System.out.println("linkedQueue is empty: " + linkedQueue.isEmpty());
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        System.out.println("linkedQueue is empty: " + linkedQueue.isEmpty());
        System.out.println("linkedQueue front element: " + linkedQueue.element());
        linkedQueue.dequeue();
        System.out.println("linkedQueue front element: " + linkedQueue.element());
    }
}

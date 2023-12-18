package ru.mirea.lab23.task1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("- - - > Тестирование ArrayQueueModule");
        ArrayQueueModule arrayQueueModule = ArrayQueueModule.getInstance();
        System.out.println("arrayQueueModule is empty: " + arrayQueueModule.isEmpty());
        arrayQueueModule.enqueue(1);
        arrayQueueModule.enqueue(2);
        System.out.println("arrayQueueModule is empty: " + arrayQueueModule.isEmpty());
        System.out.println("arrayQueueModule front element: " + arrayQueueModule.element());
        arrayQueueModule.dequeue();
        System.out.println("arrayQueueModule front element: " + arrayQueueModule.element());
        System.out.println("- - - > Тестирование ArrayQueueADT");
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        System.out.println("arrayQueueADT is empty: " + ArrayQueueADT.isEmpty(arrayQueueADT));
        ArrayQueueADT.enqueue(arrayQueueADT,1);
        ArrayQueueADT.enqueue(arrayQueueADT,2);
        System.out.println("arrayQueueADT is empty: " + ArrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println("arrayQueueADT front element: " + ArrayQueueADT.element(arrayQueueADT));
        ArrayQueueADT.dequeue(arrayQueueADT);
        System.out.println("arrayQueueADT front element: " + ArrayQueueADT.element(arrayQueueADT));
        System.out.println("- - - > Тестирование ArrayQueue (и интерфейса Queue)");
        Queue queue = new ArrayQueue();
        System.out.println("queue is empty: " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("queue is empty: " + queue.isEmpty());
        System.out.println("queue front element: " + queue.element());
        queue.dequeue();
        System.out.println("queue front element: " + queue.element());
    }
}
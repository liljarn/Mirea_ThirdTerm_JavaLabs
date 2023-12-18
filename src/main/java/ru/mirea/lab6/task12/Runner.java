package ru.mirea.lab6.task12;

public class Runner {
    public static void main(String[] args) {
        StringBuilderReceiver receiver = new StringBuilderReceiver();
        Invoker invoker = new Invoker(receiver);

        invoker.executeCommand(new AppendCommand(receiver, "Hello, "));
        System.out.println("Текущая строка: " + receiver);

        invoker.executeCommand(new AppendCommand(receiver, "World!"));
        System.out.println("Текущая строка: " + receiver);

        invoker.executeCommand(new DeleteCommand(receiver, 0, 7));
        System.out.println("Текущая строка: " + receiver);

        invoker.undoLastCommand();
        System.out.println("Отмена последней команды: " + receiver);
    }
}

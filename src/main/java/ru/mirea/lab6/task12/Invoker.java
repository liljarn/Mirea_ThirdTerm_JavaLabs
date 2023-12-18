package ru.mirea.lab6.task12;

public class Invoker {
    private final StringBuilderReceiver receiver;

    public Invoker(StringBuilderReceiver receiver) {
        this.receiver = receiver;
    }

    public void executeCommand(Command command) {
        receiver.addCommand(command);
        command.execute();
    }

    public void undoLastCommand() {
        receiver.undoCommands();
    }
}

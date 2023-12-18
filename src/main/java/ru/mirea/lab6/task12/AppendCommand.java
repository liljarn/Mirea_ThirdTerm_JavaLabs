package ru.mirea.lab6.task12;

public class AppendCommand implements Command{
    private final StringBuilderReceiver receiver;
    private final String str;

    public AppendCommand(StringBuilderReceiver receiver, String str) {
        this.receiver = receiver;
        this.str = str;
    }

    @Override
    public void execute() {
        receiver.append(str);
    }

    @Override
    public void undo() {
        int length = str.length();
        receiver.delete(receiver.length() - length, receiver.length());
    }
}

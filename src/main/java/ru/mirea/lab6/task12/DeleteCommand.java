package ru.mirea.lab6.task12;

public class DeleteCommand implements Command{
    private final StringBuilderReceiver receiver;
    private final int start;
    private final int end;
    private String deletedText;

    public DeleteCommand(StringBuilderReceiver receiver, int start, int end) {
        this.receiver = receiver;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        deletedText = receiver.substring(start, end);
        receiver.delete(start, end);
    }

    @Override
    public void undo() {
        receiver.insert(start, deletedText);
    }
}

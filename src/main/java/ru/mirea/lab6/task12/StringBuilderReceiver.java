package ru.mirea.lab6.task12;

import java.util.Stack;

public class StringBuilderReceiver {
    private final StringBuilder stringBuilder;
    private final Stack<Command> commandHistory;

    public StringBuilderReceiver() {
        stringBuilder = new StringBuilder();
        commandHistory = new Stack<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
    }

    public int length() {
        return stringBuilder.length();
    }

    public String substring(int start, int end) {
        return stringBuilder.substring(start, end);
    }

    public void insert(int offset, String str) {
        stringBuilder.insert(offset, str);
    }

    public void addCommand(Command command) {
        commandHistory.push(command);
    }

    public void undoCommands() {
        Command command = commandHistory.pop();
        command.undo();
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
package ru.mirea.lab6.task13;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private final StringBuilder stringBuilder;
    private String lastUpdate = "";
    private final List<Observer> appendObservers;
    private final List<Observer> deleteObservers;

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.deleteObservers = new ArrayList<>();
        this.appendObservers = new ArrayList<>();
    }

    public void addObserver(Observer observer, ObserverType type) {
        if (type == ObserverType.APPEND) {
            appendObservers.add(observer);
        } else if (type == ObserverType.DELETE) {
            deleteObservers.add(observer);
        }
    }

    public void removeObserver(Observer observer, ObserverType type) {
        if (type == ObserverType.APPEND) {
            appendObservers.remove(observer);
        } else if (type == ObserverType.DELETE) {
            deleteObservers.remove(observer);
        }
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        lastUpdate = str;
        notifyObservers(ObserverType.APPEND);
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        lastUpdate = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        notifyObservers(ObserverType.DELETE);
        return this;
    }

    public int length() {
        return stringBuilder.length();
    }

    public String toString() {
        return stringBuilder.toString();
    }

    private void notifyObservers(ObserverType type) {
        List<Observer> observers = (type == ObserverType.APPEND) ? appendObservers : deleteObservers;
        for (Observer observer : observers) {
            observer.update(this, lastUpdate);
        }
    }
}
package ru.mirea.lab6.task13;

public class Runner {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();
        StringAppendObserver observer = new StringAppendObserver();
        StringDeleteObserver observer2 = new StringDeleteObserver();

        observableStringBuilder.addObserver(observer, ObserverType.APPEND);
        observableStringBuilder.addObserver(observer2, ObserverType.DELETE);

        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("Observer Pattern!");
        observableStringBuilder.delete(0, 7);

        //Удалим наблюдателя добавления
        observableStringBuilder.removeObserver(observer, ObserverType.APPEND);
        observableStringBuilder.append("TaskFailed");
        System.out.println();
        System.out.println("Наша полученная строка, сообщение о добавлении строки не вышло");
        System.out.println(observableStringBuilder);
        observableStringBuilder.delete(17, 27);
    }
}

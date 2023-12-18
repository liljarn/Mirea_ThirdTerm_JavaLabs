package ru.mirea.lab6.task13;

public class StringDeleteObserver implements Observer {
    @Override
    public void update(ObservableStringBuilder subject, String lastUpadte) {
        System.out.println("Из строки был удалён элемент: " + lastUpadte);
        System.out.println("Строка после изменений: " + subject);
    }
}

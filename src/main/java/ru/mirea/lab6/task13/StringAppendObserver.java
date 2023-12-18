package ru.mirea.lab6.task13;

public class StringAppendObserver implements Observer{
    @Override
    public void update(ObservableStringBuilder subject, String lastUpadte) {
        System.out.println("К строке был добавлен элемент: " + lastUpadte);
        System.out.println("Строка после изменений: " + subject);
    }
}

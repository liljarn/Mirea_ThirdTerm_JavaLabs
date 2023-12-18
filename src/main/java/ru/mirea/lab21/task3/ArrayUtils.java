package ru.mirea.lab21.task3;

public class ArrayUtils<T> {
    private final T[] array;

    public ArrayUtils(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayUtils<Integer> intArrayUtils = new ArrayUtils<>(intArray);

        String[] stringArray = {"Hello", "World", "Java"};
        ArrayUtils<String> stringArrayUtils = new ArrayUtils<>(stringArray);

        try {
            System.out.println("Элемент с индексом 2 из intArray: " + intArrayUtils.getElementAtIndex(2));
            System.out.println("Элемент с индексом 1 из stringArray: " + stringArrayUtils.getElementAtIndex(1));
            System.out.println("Элемент с индексом 10 из intArray: " + intArrayUtils.getElementAtIndex(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
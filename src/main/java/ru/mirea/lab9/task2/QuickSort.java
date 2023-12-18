package ru.mirea.lab9.task2;

import java.util.Comparator;
import java.util.List;

public class QuickSort {
    public static <T> void quickSort(List<T> list, Comparator<T> comparator) {
        quickSortHelper(list, comparator, 0, list.size() - 1);
    }

    private static <T> void quickSortHelper(List<T> list, Comparator<T> comparator, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, comparator, low, high);
            quickSortHelper(list, comparator, low, pivotIndex - 1);
            quickSortHelper(list, comparator, pivotIndex + 1, high);
        }
    }

    private static <T> int partition(List<T> list, Comparator<T> comparator, int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private static <T>  void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

package org.example;

import java.util.Comparator;

//Класс QuickSort реализует быструю сортировку массива элементов типа T


public class QuickSort<T> {

    public void quickSort(T[] arr, Comparator<? super T> comparator) {;
        quickSort(arr, 0, arr.length - 1, comparator);
    }

    private void quickSort(T[] arr, int low, int high, Comparator<? super T> comparator) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        T pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare(arr[i], pivot) < 0) {
                i++;
            }

            while (comparator.compare(arr[j], pivot) > 0) {
                j--;
            }

            if (i <= j) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j, comparator);
        }

        if (high > i) {
            quickSort(arr, i, high, comparator);
        }
    }
}

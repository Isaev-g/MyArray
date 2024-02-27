package org.example;

import java.util.Comparator;

public class QuickSort<T> {

    public void quickSort(T[] arr, Comparator<? super T> comparator) {
        if (arr == null || arr.length == 0) {
            return;
        }
        sort(arr, 0, arr.length - 1, comparator);
    }

    private void sort(T[] arr, int low, int high, Comparator<? super T> comparator) {
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
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            sort(arr, low, j, comparator);
        }
        if (high > i) {
            sort(arr, i, high, comparator);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

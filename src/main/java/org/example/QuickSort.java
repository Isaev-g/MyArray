package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class QuickSort<T> {

    public void quickSort(ArrayList<T> list, Comparator<? super T> comparator) {
        Object[] arr = list.toArray();
        quickSort(arr, 0, arr.length - 1, comparator);
        for (int i = 0; i < arr.length; i++) {
            list.set(i, (T) arr[i]);
        }
    }

    private void quickSort(Object[] arr, int low, int high, Comparator<? super T> comparator) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Object pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare((T) arr[i], (T) pivot) < 0) {
                i++;
            }

            while (comparator.compare((T) arr[j], (T) pivot) > 0) {
                j--;
            }

            if (i <= j) {
                Object temp = arr[i];
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

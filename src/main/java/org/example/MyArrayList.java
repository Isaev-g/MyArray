package org.example;

import java.util.Arrays;

public class MyArrayList {
    private Object[] myArray;
    private int size;
    private static final int DEF = 10;

    public MyArrayList() {
        myArray = new Object[DEF];
        size = 0;
    }

    public void add(Object element) {
        if (size == myArray.length) {
            myArray = Arrays.copyOf(myArray, myArray.length * 2);
        }
        myArray[size++] = element;
    }

    public void add(int index, Object element) {
        if (index < 0  index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == myArray.length) {
            myArray = Arrays.copyOf(myArray, myArray.length * 2);
        }
        System.arraycopy(myArray, index, myArray, index + 1, size - index);
        myArray[index] = element;
        size++;
    }

    public Object get(int index) {
        if (index < 0  index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return myArray[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(myArray, index + 1, myArray, index, size - index - 1);
        size--;
    }

    public void clear() {
        myArray = new Object[DEF];
        size = 0;
    }

    public void sort() {
        Arrays.sort(myArray, 0, size);
    }
}

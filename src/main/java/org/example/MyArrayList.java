package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
        //Добавляет елемент в конец списка
    }

    public void add(int index, T element) {
        ensureCapacity();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        //Добавляет елемент по индексу

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (T) elements[index];
    }
    //Возвращает элемент на указанной позиции в этом списке.

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        //Удаляет элемент на указанной позиции в этом списке.

        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }
    //Удаляет все элементы из этого списка


    public void sort(Comparator<? super T> comparator) {
       new QuickSort<T>().quickSort((T[]) elements, comparator);
    }
    //  Сортирует этот список в соответствии с порядком, заданным указанным компаратором.
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
//         Гарантирует, что вместимость этого списка достаточна для размещения дополнительного элемента.
//  Если текущая вместимость недостаточна, вместимость удваивается.
    }

}

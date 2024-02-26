package org.example;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {
    @Test
    public void testGet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(10);
        assertEquals(Integer.valueOf(5), list.get(0));
        assertEquals(Integer.valueOf(10), list.get(1));
    }

    @Test
    public void testRemove() {
        MyArrayList<Double> list = new MyArrayList<>();
        list.add(3.14);
        list.add(2.71);
        list.remove(0);
        assertEquals(Double.valueOf(2.71), list.get(0));
    }
     @Test
    public void testClear() {
        MyArrayList<Double> list = new MyArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.clear();

         assertEquals(0, list.getSize());
    }


    @Test
    public void testAddAtIndex() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("c");
        list.add(1, "b");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testSort() {
        MyArrayList<Double> list = new MyArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(4.0);
        list.add(5.0);
        list.add(-1.0);
        list.add(2.4);
        list.add(7.3);
        list.add(-10.);
        list.add(-1.4);
        list.add(100.);

        Comparator<Double> comparator = (o1, o2) -> {
            if (o1 < o2) {
                return -1;
            } else if (o1 > o2) {
                return 1;
            } else return 0;
        };

        list.sort(comparator);


    }
}

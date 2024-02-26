package org.example;

import org.junit.jupiter.api.Test;

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

         assertEquals(0, list.size());
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
}

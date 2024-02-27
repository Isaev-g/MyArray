package org.example;

import org.example.domain.Student;
import org.example.domain.StudentComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {

    private static final QuickSort<Student> sort = new QuickSort<>();
    private static final StudentComparator comparator = new StudentComparator();

    @Test
    public void testSort() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("name1");
        student1.setDepartment("department1");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("name2");
        student2.setDepartment("department2");

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("name3");
        student3.setDepartment("department3");

        Student[] students = new Student[]{student1, student3, student2};

        sort.quickSort(students, comparator);

        assertEquals(student1.getId(), students[0].getId());
        assertEquals(student2.getId(), students[1].getId());
        assertEquals(student3.getId(), students[2].getId());
    }

    @Test
    public void testSortNullValues() {
        Student student1 = new Student();
        student1.setId(null);
        student1.setName("name1");
        student1.setDepartment("department1");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("name2");
        student2.setDepartment("department2");

        Student student3 = new Student();
        student3.setId(null);
        student3.setName("name3");
        student3.setDepartment("department3");

        Student student4 = new Student();
        student4.setId(4);
        student4.setName("name4");
        student4.setDepartment("department4");

        Student[] students = new Student[]{student1, student2, student3, student4};

        sort.quickSort(students, comparator);

        assertEquals(student2.getId(), students[0].getId());
        assertEquals(student4.getId(), students[1].getId());
        assertEquals(student1.getId(), students[2].getId());
        assertEquals(student3.getId(), students[3].getId());
    }
}

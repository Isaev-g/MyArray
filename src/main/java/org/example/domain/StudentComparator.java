package org.example.domain;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getId() == null && s2.getId() == null) {
            return 0;
        } else if (s1.getId() == null) {
            return 1;
        }else if(s2.getId() == null) {
            return -1;
        } else {
            return s1.getId().compareTo(s2.getId());
        }
    }
}

package org.newfische.example;

import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudents(int studentID, Student student) {
        this.students.put(studentID,student);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}

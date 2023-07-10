package org.example.Solid.good.o;

import java.util.Map;
import java.util.TreeMap;

public class StudentSorter implements Sorter<Student_OCP_good> {
    @Override
    public Map<Integer,Student_OCP_good> sort(Map<Integer, Student_OCP_good> studentMap) {
        Map<Integer, Student_OCP_good> sortedStudentMap = new TreeMap<>(studentMap);
        return sortedStudentMap;
    }
}
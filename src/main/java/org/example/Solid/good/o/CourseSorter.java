package org.example.Solid.good.o;

import java.util.Map;
import java.util.TreeMap;

class CourseSorter implements Sorter<Course_OCP_good> {
    public Map<Integer,Course_OCP_good> sort(Map<Integer, Course_OCP_good> courseMap) {
        Map<Integer, Course_OCP_good> sortedCourseMap = new TreeMap<>(courseMap);
        return sortedCourseMap;
    }
}
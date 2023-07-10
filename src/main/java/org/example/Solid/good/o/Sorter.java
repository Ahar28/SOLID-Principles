package org.example.Solid.good.o;

import java.util.Map;

public interface Sorter<T> {
    Map<Integer,T> sort(Map<Integer, T> map);
}
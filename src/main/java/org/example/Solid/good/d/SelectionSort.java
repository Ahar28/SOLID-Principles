package org.example.Solid.good.d;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[minIndex]) {
                    minIndex = j;
                }
            }
            // Swapping the elements
            int temp = intArray[minIndex];
            intArray[minIndex] = intArray[i];
            intArray[i] = temp;
        }
    }
}
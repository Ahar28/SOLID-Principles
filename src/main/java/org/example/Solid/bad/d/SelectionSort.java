package org.example.Solid.bad.d;

public class SelectionSort {
    public void selectionSort(int[] intArray) {
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
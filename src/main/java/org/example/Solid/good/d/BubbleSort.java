package org.example.Solid.good.d;

public class BubbleSort implements SortingAlgorithm{
    @Override
    public void sort(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    // Swapping the elements
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
    }
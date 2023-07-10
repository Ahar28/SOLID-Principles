package org.example.Solid.good.d;

public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] intArray) {
        quickSortOperation(intArray, 0, intArray.length - 1);
    }
    private void quickSortOperation(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Recursively sort partitions
            quickSortOperation(array, low, partitionIndex - 1);
            quickSortOperation(array, partitionIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swapping elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
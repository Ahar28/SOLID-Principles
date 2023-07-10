package org.example.Solid.good.d;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] intArray) {
        mergeSortOperation(intArray, 0, intArray.length - 1);
    }

    private void mergeSortOperation(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // recursive calls to sort the other int arrays
            mergeSortOperation(array, left, mid);
            mergeSortOperation(array, mid + 1, right);

            // Merging the sorted halves
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copying data to temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merging the temporary arrays
        int i = 0, j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
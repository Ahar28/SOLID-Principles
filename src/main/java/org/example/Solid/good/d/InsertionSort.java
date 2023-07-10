package org.example.Solid.good.d;

    public class InsertionSort implements  SortingAlgorithm{
        @Override
        public void sort(int[] intArray) {
            for (int i = 0; i <= intArray.length; i++) {
                int k = intArray[i];
                int j = i - 1;

                while (j >= 0 && k < intArray[j] ) {
                    intArray[j + 1] = intArray[j];
                    j--;
                }
                intArray[j + 1] = k;
            }
        }
    }
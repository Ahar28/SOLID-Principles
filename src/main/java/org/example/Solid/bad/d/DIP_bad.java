package org.example.Solid.bad.d;

import java.util.Scanner;

public class DIP_bad {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        /* InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();*/

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = scn.nextInt();

        int[] intArray = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            intArray[i] = scn.nextInt();
        }

        System.out.print("Do you want to sort the array? (y/n): ");
        String sortChoice = scn.next().toLowerCase();

        if (sortChoice.equals("y")) {
            System.out.println("Original array: ");
            printElement(intArray);

            bubbleSort.bubbleSort(intArray);
            System.out.println("Sorted Array");
            printElement(intArray);
            //insertionSort.insertionSort(intArray);
            //selectionSort.selectionSort(intArray);
            //mergeSort.mergeSort(intArray);
            //quickSort.quickSort(intArray);
        }
    }

    public static void printElement(int[] intarray){
        for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
    }
}
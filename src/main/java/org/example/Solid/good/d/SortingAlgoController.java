package org.example.Solid.good.d;

    public class SortingAlgoController {
    private SortingAlgorithm sortingAlgorithm;

    public SortingAlgoController(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }
    public SortingAlgoController( ) {
    }
    public void performSort(int[] intArray) {
        sortingAlgorithm.sort(intArray);
    }
}
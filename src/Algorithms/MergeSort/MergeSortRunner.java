package Algorithms.MergeSort;


import java.util.Arrays;

public class MergeSortRunner {
    public static void main(String[] args) {

        int arr1[] = { 5, 3, 4, 2};

        System.out.println("Array Before MergeSort: "+ Arrays.toString(arr1));
        MergeSort.mergeSort(arr1, 0, arr1.length-1);
        System.out.println("Array After MergeSort: "+ Arrays.toString(arr1));

    }
}

package Algorithms.QuickSort;

import java.util.Arrays;

public class QuickSortRunner {
    public static void main(String[] args) {

        int arr[] = {3,5,4};

        System.out.println("Array Before QuickSort: "+ Arrays.toString(arr));
        QuickSort.quickSort(arr, 0, arr.length-1);
        System.out.println("Array After QuickSort: "+ Arrays.toString(arr));

    }
}

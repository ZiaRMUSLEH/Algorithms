package Algorithms_RPT.QuickSort;

import Algorithms_RPT.insertionSort.InsertionSort;

import java.util.Arrays;

public class QuickSortRunner {
    public static void main (String[] args) {
        int arr[] = {3,5,4};

        System.out.println("Array Before InsertionSort: "+ Arrays.toString(arr));
        QuickSort.quickSort(arr,0, arr.length-1);
        System.out.println("Array After InsertionSort: "+Arrays.toString(arr));

    }

}

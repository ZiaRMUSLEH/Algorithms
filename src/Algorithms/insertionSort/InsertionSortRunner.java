package Algorithms.insertionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main (String[] args) {

        int[] arr1 = {7,4,5,9,8,2,1};

        System.out.println("Array Before InsertionSort: "+Arrays.toString(arr1));
      InsertionSort.insertionSort(arr1);
        System.out.println("Array After InsertionSort: "+Arrays.toString(arr1));

    }
}

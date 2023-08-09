package Algorithms_RPT.BubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {

        int arr[] = { 3, 1, 2,8,9,5,4,8,2,7,8,7};

        System.out.println("Array Before Algorithms.BubbleSort: "+ Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("Array After Algorithms.BubbleSort: "+ Arrays.toString(arr));

    }
}
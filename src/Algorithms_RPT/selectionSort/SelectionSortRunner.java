package Algorithms_RPT.selectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortRunner {
    public static void main(String[] args) {
         int arr[] = {9,5,8,6};
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("After Sorting: "+ Arrays.toString(arr));



        }
    }

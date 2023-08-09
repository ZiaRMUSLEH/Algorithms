package Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {
    public static void main(String[] args) {

        int arr[] = {3, 5, 4};

        System.out.println("Array Before ShellSort: "+ Arrays.toString(arr));
        ShellSort.shellSort(arr);
        System.out.println("Array After ShellSort: "+ Arrays.toString(arr));

    }
}

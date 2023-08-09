package Algorithms;



import Algorithms.BubbleSort.BubbleSort;
import Algorithms.InsertionSort.InsertionSort;
import Algorithms.MergeSort.MergeSort;
import Algorithms.QuickSort.QuickSort;
import Algorithms.ShellSort.ShellSort;
import Algorithms.selectionSort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {

    public static void main(String[] args) {

        int[] arr = WhichOneIsFaster.createArray(10000);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        int[] arr5 = Arrays.copyOf(arr, arr.length);
        int[] arr6 = Arrays.copyOf(arr, arr.length);

        int orderedArr[] = WhichOneIsFaster.createSortedArray(10000);


        long startTime;
        long endTime;
        double estimatedTime;

        // InsertionSort
        startTime = System.currentTimeMillis();
        InsertionSort.insertionSort(arr);
        endTime = System.currentTimeMillis();

        estimatedTime = (double)(endTime-startTime) / 1000;
        System.out.println("Insertion Sort: "+estimatedTime);

        // SelectionSort
        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(arr2);
        endTime = System.currentTimeMillis();

        estimatedTime = (double)(endTime-startTime) / 1000;
        System.out.println("Selection Sort: "+estimatedTime);

        // BubbleSort
        startTime = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr3);
        endTime = System.currentTimeMillis();

        estimatedTime = (double)(endTime-startTime) / 1000;
        System.out.println("Bubble Sort: "+estimatedTime);

        // MergeSort
        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(arr4, 0, arr.length-4);
        endTime = System.currentTimeMillis();

        estimatedTime = (double)(endTime-startTime) / 1000;
        System.out.println("Merge Sort: "+estimatedTime);

        // QuickSort
        startTime = System.currentTimeMillis();
        QuickSort.quickSort(arr5, 0, arr.length-4);
        endTime = System.currentTimeMillis();

        estimatedTime = (double)(endTime-startTime) / 1000;
        System.out.println("Quick Sort: "+estimatedTime);

        // ShellSort
        startTime = System.currentTimeMillis();
        ShellSort.shellSort(arr6);
        endTime = System.currentTimeMillis();

        estimatedTime = (double)(endTime-startTime) / 1000;
        System.out.println("Shell Sort: "+estimatedTime);

    }

    public static int[] createArray(int valueCount){

        int[] arr = new int[valueCount];
        Random r = new Random();
        for (int i=1; i<arr.length; i++){
            arr[i] = r.nextInt(10000);
        }
        return arr;

    }

    public static int[] createSortedArray(int valueCount){

        int[] arr = new int[valueCount];
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        return arr;

    }



}

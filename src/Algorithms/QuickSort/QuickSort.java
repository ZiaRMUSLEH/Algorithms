package Algorithms.QuickSort;

public class QuickSort {

    public static int partition(int[] arr, int bottom, int top){

        // Selecting the top/last element that I have in the array, as the pivot
        int pivot = arr[top];

        int i = (bottom-1);

        for (int j=bottom; j<top; j++){
            if (arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[top];
        arr[top] = temp;

        // This will help us to select the next pivot element in the recursive process
        return i+1;
    }

    public static void quickSort(int arr[], int bottom, int top){

        if (top>bottom){

            int piv = partition(arr, bottom, top);

            quickSort(arr, bottom, piv-1); // For the left side
            quickSort(arr, piv+1, top); // For the right side

        }

    }

}

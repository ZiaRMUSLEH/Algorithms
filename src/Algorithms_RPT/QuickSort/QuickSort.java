package Algorithms_RPT.QuickSort;

public class QuickSort {

    public static int partition(int[] arr, int bottom, int top) {
        int pivot = arr[top];
        int i = (bottom - 1);

        for (int j = bottom; j < top; j++) {

            if (arr[j]<=pivot){

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp1 = arr[i+1];
        arr[i+1] = arr[top];
        arr[top] = temp1;

        return i+1;
    }

    public static void quickSort(int arr[], int bottom, int top){

        if(top>bottom){
            int piv = partition(arr, bottom, top);
            quickSort(arr, bottom,piv-1);
            quickSort(arr, piv+1, top);
        }

    }

}

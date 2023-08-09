package Algorithms.InsertionSort;

public class InsertionSort {

    public static void insertionSort(int arr[]){

        for (int i=1; i<arr.length; i++){

            // Getting the current value from current index
            int value = arr[i];

            // Since we are going to compare the current number, with the left value, we are writing i-1
            int j = i-1;

            while (j >= 0 && arr[j] > value){

                arr[j+1] = arr[j];

                // We decrease j by one so that it can keep swapping
                j = j-1;

            }

            // Before we move onto the next number, make the current number, value.
            arr[j+1] = value;
        }

    }

}

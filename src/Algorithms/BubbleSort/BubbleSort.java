package Algorithms.BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int arr[]){

        // Is there a swapping happened? If so move on
        boolean swapped = false;

        do {
            swapped = false;

            // Comparing the current value with the left value
            for (int i=1; i<arr.length; i++){

                // If the left value, is more than the current value
                if (arr[i-1] > arr[i]){

                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;

                }

            }

        }while (swapped);

    }

}

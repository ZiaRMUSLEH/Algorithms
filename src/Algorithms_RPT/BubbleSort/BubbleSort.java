package Algorithms_RPT.BubbleSort;

public class BubbleSort {


    public static void bubbleSort (int[] arr) {
        boolean swap = false;
        do {
            swap = false;
            for(int i = 1;i< arr.length; i++){
                int j = i-1;

                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }

            }

        }while (swap);



    }
}
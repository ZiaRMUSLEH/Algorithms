package Algorithms_RPT.insertionSort;

public class InsertionSort {


    public static void insertionSort (int[] arr1) {

        for(int i = 1; i<arr1.length; i++){

            for(int j = 0; j<i; j++){

                if(arr1[i]<arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }

        }

    }
}


package Algorithms.selectionSort;

import java.util.Random;

public class SelectionSortRunner {
    public static void main(String[] args) {

        Random random = new Random();

        int [] intList = new int[100000];
        for(int i = 0; i<intList.length; i++){
            intList[i] = random.nextInt(10000);
        }


        int [] arr = {7, 2, 1};
        System.out.println("**** Before Selection Sort *****");
        for(int a : intList){
            System.out.print(a +" ");
        }
        System.out.println();
        System.out.println("**** After Selection Sort *****");
        SelectionSort.selectionSort(intList); // sort array using selection sort
        for(int a : intList){
            System.out.print(a +" ");
        }
    }
}
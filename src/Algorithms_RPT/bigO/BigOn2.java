package Algorithms_RPT.bigO;

public class BigOn2 {
    public static void main (String[] args) {
        int[] arr = {5,9,8,7,6,2};

        printResultOfMultiplyEachElementWithAllElements(arr);

    }


    public static void printResultOfMultiplyEachElementWithAllElements(int[]arr){
       int countExecutions = 0;
        for (int a:arr) {
            for(int b:arr){
                System.out.print(a*b+", ");
                countExecutions++;
            }
        }
        System.out.println("\ncountExecutions = " + countExecutions);
    }
}
package Day3;

import java.util.Arrays;

public class TaskDay3 {

    public static void main(String[] args){
        //Task -1

        System.out.println("Task-1\n");
        int arr[][] = new int[10][10];

        for(int i=0;i< arr.length;i++){
            System.out.println("--------------------------------");
            System.out.println("\nTable of - " + (i+1));
            System.out.println("--------------------------------");
            for(int j=0;j<arr.length;j++){
                System.out.println((i+1)+" * "+(j+1)+" = "+ (arr[i][j]=(i+1)*(j+1)));
            }

        }

        System.out.println("_______________________________________");

        //Task-2
        System.out.println("Task-2");
        int[] originalArray = {12,14,15,39};
        int[] copy_OriginalArray = new int[originalArray.length];
        System.out.println("original array: " + Arrays.toString(originalArray));
        for(int i=0; i<originalArray.length; i++){
            copy_OriginalArray[i] = originalArray[i];
        }
        System.out.println("Copied array: " + Arrays.toString(copy_OriginalArray));
    }
}

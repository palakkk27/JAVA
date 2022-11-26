import java.util.*;
// package JAVA PROGRAMS.Sorting;

// bubble sort : In this we compare and swap i.e bigger number is pushed backwards

public class bubble_sort {

    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int swap=0;
            for (int j = 0; j < arr.length-1; j++) {
                //swaping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++; // this checks the number of swaps
                    System.out.print(swap+ " ");
                }
            }
        }
    }
    // to print the sorted array we need to create one more loop

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubble(arr);
        printArr(arr);
    }
}

// hence time complexity of the code is : O(n^2) because 
import java.util.*;
//from unsorted take the number and put it in the sorted array
public class insertion_sort {
    public static void insertion(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i-1;

            while (prev>=0 && arr[prev]>temp) // in && operator both the statements must be true forresults to be true i.e T T => T | T F =>F| F F =>F
            { 
                arr[prev+1] = arr[prev]; // right value is assigned to the left 
                prev -- ; // as we go from unsorted to sorted i.e right to left thus decrement
            }
            arr[prev+1]=  temp ;
        }
    }

    public static void printArr(int arr[]){ // this loop is required for printing the elements of array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 }; 
        insertion(arr);
        printArr(arr);
        
    }
}

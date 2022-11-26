import java.util.*;
//in this sorting one finds the smallest number and then  swap it with the first one
public class selection_sort {

    public static void selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) { // no of passes takes place i.e n-1
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                // if second element is smaller than the first set min value to j 
                if (arr[j]<arr[min]) { 
                    min = j;
                } 
            }
            // when loop reaches the final part and comes n<n then this will takes place 
                    if (min!= i) { 
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }

        }
    // this loop is for printing the sorted array 
        public static void printArr(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int arr[]={ 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selection(arr);
        printArr(arr);
        
    }
}

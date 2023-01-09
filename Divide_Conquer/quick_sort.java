public class quick_sort {

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei){
        int p_index = partition(arr , si , ei);
        quicksort(arr, si, p_index-1);
        quicksort(arr, p_index+1, ei);

    }
     public static void partition (int arr [], int si , int ei)
    public static void main(String[] args) {
        
    }
}

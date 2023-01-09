public class merge_sort{

    // for printing the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");     //ln hata de
        }
        System.out.println();
    }

    public static void merge(int arr[] , int si , int ei){
        if (si>=ei){
            return; //base case  //; missing tha
        }  
        
        int mid = si + (ei-si)/2;       //(ei-si)/2 nai si + (ei-si)/2 ye hoga
        merge(arr , si , mid);          //left part
        merge(arr , mid+1 ,ei);         //right part     //e1 likha tha ei hoyega
        merge2(arr , si , mid, ei);     //  merge2(arr , si , ei, mid) tune
                                        //merge2(arr , si , mid, ei) likha tha

    }

    public static void merge2(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];  //temp ke aage [] ye missing tha
        int i = si;
        int j = mid + 1;
        int k = 0;// buffer point

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) 
            {
                temp[k] = arr[i];
                i++;                    //i++nai likha tha
            } 
            else {
                temp[k] = arr[j];
                j++;                     //j++nai likha tha
            }
            k++;
        }

        // to print all the elements of left part if it has missed any number
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // to print all the elements of right part if it has missed any number
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to origiinal arr
        for (k = 0, i = si; k<temp.length; k++, i++) {      //k<temp.length hoyega  k.temp.length likha tha
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 3, -1, 0, 9, 5 };      //arr ye aage [] missing tha
        merge(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
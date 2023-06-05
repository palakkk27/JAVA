public class selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minposi=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minposi]>arr[j]){
                    minposi=j;

                }
            }
        int temp=arr[minposi];
        arr[minposi]=arr[i];
        arr[i]=temp;
        }
        

                    
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,1,4,6};
        selectionsort(arr);
        printarr(arr);

    }
    
}

import java.util.*;
// search elements using key 
public class binary_search {
    public static int binSearch(int num[], int key){
        int start = 0 , end = num.length-1;

        while (start<=end){
            int mid = (start+end)/2 ;
            if (num[mid]==key) {
                return mid;
            }
            if(num[mid]<key){
                start = mid+1; // as key element is greater than mid , thus next to the mid element will be start = mid + 1 
            }

            else{
                end = mid-1; // as key element is smaller than mid , thus left to the mid element will be mid- 1
            }
        }

        return -1; //element NOT FOUND in the array
    }
    public static void main(String[] args) {
        int num[]= {2,4,6,7,8,9,10};
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter key: ");
        int key = sc.nextInt();
        

        System.out.printf("index at which number is found : "+ binSearch(num, key)); 
    }
}

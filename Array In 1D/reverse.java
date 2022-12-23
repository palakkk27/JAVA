import java.util.*;
public class reverse {

    public static void rev_arr(int num[]){
        int first = 0 , last = num.length-1;
        while (first<=last) {
            int temp= num[last];
            num[last] = num[first];
            num[first] = temp; //swap

            first++;
            last--;

        }
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,5,8};

        rev_arr(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}

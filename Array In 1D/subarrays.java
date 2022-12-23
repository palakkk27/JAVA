import java.util.*;

public class subarrays {

    public static void subarr(int num[]) {
        int currSumm = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;

                currSumm = 0;

                for (int k = start; k <= end; k++) {
                    // System.out.print(num[k]+" "); // print subarrays
                    currSumm += num[k];
                }
                System.out.println(currSumm);

                if (maxSum<currSumm) {
                    maxSum=currSumm;
                }
            }
        }
        System.out.println("maximum sum is " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 6, 7, 8 };
        subarr(num);
    }
}

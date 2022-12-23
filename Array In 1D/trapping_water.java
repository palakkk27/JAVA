import java.util.*;
public class trapping_water {

    public static int trappedwater(int height[]){

        //calculate left max and right max

        int n = height.length;
        int leftMax[]= new int[n];
        leftMax[0] = height[0]; // initially max height will be at 0
        for (int i = 1; i < n; i++) { //increment to find left highest bar
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n] ; //creating auxillary verbs 
        rightMax[n - 1] = height[n - 1]; 
        for (int i = n-2; i >= 0; i--) { // decrement to find right highest bar 
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }


        int trappedwater = 0;
        for (int i = 0; i <n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i]; // formula to find trapped water 
        }

        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {4,0,2,5,1,7,8};
        System.out.println( trappedwater(height));
    }
}

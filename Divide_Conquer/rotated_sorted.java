public class rotated_sorted {
    
    public static int search(int nums[], int target , int si , int ei) {
        // target = 0;
        if(si>ei){
            return -1;
        }
        int mid = si+ (ei-si)/2; // work 

        //case found 
        if(nums[mid] == target){
            return mid;
        }

        if(nums[si]<= nums[mid]){
            if(nums[si]<= target && target<= nums[mid]){
            return search(nums, target, si, mid - 1);
        }

        else{
            return search(nums, target, mid+1, ei);
        }
        }

        else{
        
            if(nums[mid]<= target && target<= nums[ei]){
            return search(nums, target, mid+1, ei);
        }

        else{

            return search(nums, target, si, mid-1);
        }
    }
}
    public static void main(String args[]) {
        
        int nums[]= {4,5,6,7,0,1,2};
        int target = 0;
        int tar_index = search(nums, target, 0, nums.length-1);
        System.out.println(tar_index);
    }


    }












    class Solution {
        public int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length-1, target);
    }
    
    public int binarysearch(int[] nums, int si, int ei, int target){
            // int target = 0;
            if(si>ei){
                return -1;
            }
            int mid = si+ (ei-si)/2; // work 
    
            //case found 
            if(nums[mid] == target){
                return mid;
            }
    
            if(nums[si]<= nums[mid]){
                if(nums[si]<= target && target<= nums[mid]){
                return binarysearch(nums, si, mid-1, target);
            }
    
            else{
                return binarysearch(nums, mid+1, ei, target);
            }
            }
    
            else{
            
                if(nums[mid]<= target && target<= nums[ei]){
                return binarysearch(nums,mid+1, ei, target);
            }
    
            else{
    
                return binarysearch(nums, target, si, mid-1);
            }
            // int tar_index = search(nums, target, 0, nums.length-1);
        
    
    }
       
     
       }   }
        
    
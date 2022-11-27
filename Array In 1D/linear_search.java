import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many elements do you want to store : ");
        int n = sc.nextInt();

       
            int[] array = new int[n];  
            System.out.println("Enter the elements of the array: ");  
            //reading array elements from the user   
            for(int i=0; i<n; i++) {  
            array[i]=sc.nextInt();  
            }  

            System.out.println("Array elements are: ");  
            
            // accessing array elements using the for loop  
            for (int i=0; i<n; i++)   
            {  
            System.out.print(array[i] + ", ");  
            }

            System.out.println();
            
            System.out.print("ENTER KEY TO SEARCH : ");
            int key = sc.nextInt();

            int found = 0; // flag variable to know whether we were able to find the number in the array or not
            for (int j = 0; j < array.length; j++) {
                if (key==array[j]) {
                    System.out.println("element found at index : " + j);
                    found = 1; // if search is done
                    break;
                }

            }
                if (found == 0){ // if number doesnt fit in the array 
                    System.out.println("NOT FOUND i.e -1");
                }
                
         }  
    }   
        
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int n = sc.nextInt();
    

        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<n; i++)   
        {  
        System.out.print(array[i] + ", ");  
        }  
    }  
}   

   
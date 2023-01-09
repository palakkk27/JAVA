// Write a Java method to find the smallest number among three numbers.
import java.util.*;

public class smallest_func{

    public static int smallest(int a , int b , int c){

        if(a<b) {
            if(c<a) {
                System.out.println(c);
            } else {
                System.out.println(a);

            }
        } 
        else {
            if(b<c) {
            System.out.println(b);

            } else {
                System.out.println(c);

            }
        }

        return smallest(a, b, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

      System.out.println(smallest(num1, num2, num3));
    }
}
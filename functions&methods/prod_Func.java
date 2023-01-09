import java.util.*;
public class prod_Func {

    public static int product(int a , int b ){

        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int calc = product(num1,num2);

        System.out.println("the product of given numbers is : "+calc);

    }
}

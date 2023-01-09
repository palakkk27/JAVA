import java.util.*;
public class fac_func {

    public static int fact(int n ){
        int prod = 1;
        for (int i = 1; i <= n; i++) {

            prod= prod*i;
            
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = fact(num);

        System.out.println("the factorial of given number is : "+ ans);

    }
}

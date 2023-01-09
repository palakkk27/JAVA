import java.util.*;
public class binomial {
    public static int fact(int n ){
        int prod = 1;
        for (int i = 1; i <= n; i++) {

            prod= prod*i;
            
        }
        return prod;
    }
    public static int bin_func(int n , int r ){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int bin_func =( n_fact)/((r_fact)*(nmr_fact));

        return bin_func;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        System.out.println("binomial function is : "+ bin_func(n, r));

        
    }
}

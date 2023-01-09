import java.util.*;
public class even {

    public static boolean isEven(int n){
        boolean isEven = true;
        if (n%2!=0) {
            isEven = false;
        }

        return isEven;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
}

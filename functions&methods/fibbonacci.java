import java.util.Scanner;

class fibbonacci {
  public static void main(String[] args) {
    int a=0 , b=1 , i, n;

    System.out.print("number of terms : ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    for ( i = 0; i <= n; i++) {
        System.out.print(a + " ");
        int next = a+b;
        a=b;
        b=next;
    }
  }
}

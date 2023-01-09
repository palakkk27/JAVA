// Write a Java method to compute the average of three numbers
import java.util.*;
public class average {
    public static double avr(double a , double b , double c){
        double form = (a+b+c)/3;
        return form;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();

        System.out.println(avr(num1, num2, num3));
    }
}

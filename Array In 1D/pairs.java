import java.util.*;
public class pairs {
    public static void pairs_arr(int num[]){
        for (int i = 0; i < num.length; i++) {
            int currr = num[i];

            for (int j = i+1; j < num.length; j++) {
                System.out.print( "(" + currr + ","+ num[j]+ ")" );
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int num[]={0,2,4,5,6,7};
        pairs_arr(num);
    }
}

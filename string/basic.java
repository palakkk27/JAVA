import java.util.*;
public class strings_basics {
    //WE KNOW STRINGS ARE IMMUTABLE i.e. STRINGS CAN NEVER CHANGE

    public static void main(String[] args) {
        //INPUT
        Scanner sc = new Scanner(System.in);
        String name ;
        // name = sc.next();// returns first word 
        name = sc.nextLine();// returns whole word
        System.out.println(name);

        //STRING LENGTH
        System.out.println(name.length());

        //concatenation : joining of strings using +
        String fname  = "palak";
        String lname  = "garg";

        String fullname = fname + lname;
        System.out.println(fullname);

        //charAt method : returns the letter at particular index
        fname.charAt(2);
        System.out.println(fname);


        // to print all the letters 
         for (int i = 0; i < fname.length(); i++) {
            fname.charAt(i);
            System.out.println(fname.charAt(i));
         }

         //compare
         String s1 = "palak";
         String s2 = "palak";
         String s3 = new String("palak");

         if (s1==s2) {
            System.out.println("equal");
                        
         }

         if(s1==s3){
            System.out.println("equal");
         }

         else{
            System.out.println("not equal"); // s1==s3 comes not equal because == compare on object not value 
         }



        // to compare the value we will use equals
         if(s1.equals(s3)){
            System.out.println("equal");
         }

         else{
            System.out.println("not equal");
         }

    

    }
}

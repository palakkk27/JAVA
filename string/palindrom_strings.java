public class palindrom_strings {
    public static void palindrome(String palind){
        int n = palind.length();
    for (int i = 0; i < n/2; i++) {

        if (palind.charAt(i)==palind.charAt(n-1-i)) {
            System.out.println(palind + " is a Palindrome String.");
            break;
        }
else{
        System.out.println(palind + " is not a Palindrome String.");
        break;
    }
    }
}
    public static void main(String[] args) {
        String palind = "malayalam";
        palindrome(palind);
    }
}

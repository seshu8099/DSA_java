
import java.util.Scanner;

public class palindromestr {

    public static boolean pal(String s, int start, int end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        } else if (start >= end) {
            return true;
        }

        return pal(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.err.print("enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (pal(str, 0, str.length() - 1)) {
            System.err.println("palindrome");
        } else {
            System.err.println("not a pal");
        }
    }
}

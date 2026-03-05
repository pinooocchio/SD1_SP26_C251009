import java.util.*;

class plm17 {
    public static void main(String[] arg) {
        int f = 1;

        String s = "civisc";

        for (int i = 0, j = s.length() - 1; i < (s.length() / 2); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {

                f = 0;
                break;
            }

        }

        if (f == 1)
            System.out.println("This string is a palindrome");
        else
            System.out.println("This string is not a palindrome");
    }
}
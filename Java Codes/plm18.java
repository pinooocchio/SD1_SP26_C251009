import java.util.*;

class plm18 {
    public static void main(String[] arg) {
        int vowel = 0;
        int consonant = 0;

        String s = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {

                vowel++;
            } else
                consonant++;

        }
        System.out.println("Totall Vowels " + vowel);
        System.out.println("Totall Consonants " + consonant);

    }
}
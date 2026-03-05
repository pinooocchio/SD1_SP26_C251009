import java.util.*;

class plm14 {
    public static void main(String[] arg) {

        int[] arr = { 10, 20, 5, 111, 2 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        
        System.out.println("There are " + even + " Even numbers in the array");
        System.out.println("There are " + odd + " Odd numbers in the array");

    }
}
import java.util.*;

class plm15 {
    public static void main(String[] arg) {

        int[] arr = { 10, 20, 5, 111, 2 };
        int f = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                System.out.println("The element found");
                f = 0;
                break;
            }
        }
        if (f == 1)
            System.out.println("The element not found");

    }
}
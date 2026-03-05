import java.util.*;

class plm11 {
    public static void main(String[] arg) {

        int[] arr = { 10, 20, 5, 111, 25 };
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.printf("the largest number in the array is " + max);

    }
}
import java.util.*;

class plm12 {
    public static void main(String[] arg) {

        int[] arr = { 10, 20, 5, 111, 2 };
        int min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.printf("the smallest number in the array is " + min);

    }
}
import java.util.*;

class plm13 {
    public static void main(String[] arg) {

        int[] arr = { 10, 20, 5, 111, 2 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.print("the average of the array is " + avg);

    }
}
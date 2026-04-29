import java.util.*;

public class plm33_RATED_605 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int x = 18;
        int cnt = 0;
        for( int i = 0 ; i< n ; i++)
        {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x)
                cnt++;
        }
        System.out.println(cnt);

    }
}

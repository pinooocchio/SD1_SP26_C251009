import java.util.*;

public class plm32_RATED_580 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int q = input.nextInt();
        int r = input.nextInt();
        int s = input.nextInt();
        int sum = p + q + r + s;
        if (p > sum - p || q > sum - q || r > sum - r || s > sum - s)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

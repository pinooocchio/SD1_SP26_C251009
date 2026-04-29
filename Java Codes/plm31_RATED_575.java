import java.util.*;

public class plm31_RATED_575 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "street begger";
        String b = "street hawker";
        String c = "street painter";
        String x = input.nextLine();
        if (x.equals(a) || x.equals(b) || x.equals(c))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

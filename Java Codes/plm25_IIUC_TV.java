import java.util.*;

public class plm25_IIUC_TV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 6)
            System.out.println("300tk");
        else if (n % 6 == 0) {
            System.out.println((n / 6) * 300 + "tk");

        } else
            System.out.println(((n / 6) * 300) + 300 + "tk");

    }
}

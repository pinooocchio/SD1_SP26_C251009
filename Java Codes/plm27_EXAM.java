import java.util.*;

public class plm27_EXAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int toatl_student = x * y;
        double passed = ((double) z / toatl_student) * 100;
        if (passed > 50)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

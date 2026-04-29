import java.util.*;

class plm20_MAKE_AVG {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = input.nextInt();
        if ((a + c) % 2 == 0)
            System.out.println("B Exist");
        else
            System.out.println("B Does Not Exist");
    }
}
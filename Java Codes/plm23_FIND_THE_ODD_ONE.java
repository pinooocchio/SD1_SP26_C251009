import java.util.*;

public class plm23_FIND_THE_ODD_ONE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b)
            System.out.println("C is Different");
        else if (b == c)
            System.out.println("A is Different");
        else
            System.out.println("B is Different");

    }

}

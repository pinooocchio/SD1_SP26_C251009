import java.util.*;

class plm4 {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number:");
        int num2 = input.nextInt();
        System.out.print("Enter Your Third Number:");

        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.print("First Number is Largest");
        else if (num2 > num1 && num2 > num3)
            System.out.print("Second Number is Largest");
        else
            System.out.print("Third Number is Largest");

    }
}

import java.util.*;

class plm05 {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        double num1 = input.nextDouble();
        System.out.print("Enter Your Second Number:");
        double num2 = input.nextDouble();
        System.out.println("1.Add");
        System.out.println("2.Substract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        double num3 = input.nextDouble();

        if (num3 == 1)

            System.out.print(num1 + num2);
        else if (num3 == 2)
            System.out.print(num1 - num2);
        else if (num3 == 3)
            System.out.print(num1 * num2);
        else if (num3 == 4)
            System.out.print(num1 / num2);
        else
            System.out.println("Invalid Input");

    }
}

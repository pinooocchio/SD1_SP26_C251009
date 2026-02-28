import java.util.*;
class plm3 {
    public static void main(String[] arg)
    {
        System.out.print("Enter Your Number:"); 
        Scanner input = new Scanner( System.in);
        int num = input.nextInt();
        if(num % 2 == 0)
            System.out.print("Your Number is Even");
        else
            System.out.print("Your Number is Odd");
        
        
    }
}

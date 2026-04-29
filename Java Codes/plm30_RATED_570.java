import java.util.*;
public class plm30_RATED_570 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int rem = n - x;
        if( rem % 4 == 0)
            System.out.println(rem/4);
        else
            System.out.println((rem/4)+1);
        
    }
}

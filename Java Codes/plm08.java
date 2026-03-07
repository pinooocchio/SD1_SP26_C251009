import java.util.*;

class plm08 {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 1;
        for (int i = n; i > 0 ; i--) {
            
           ans *= i; 
        }
        System.out.print(ans);

    }
}

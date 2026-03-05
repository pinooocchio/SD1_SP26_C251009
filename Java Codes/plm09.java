import java.util.*;

class plm9 {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;
        
        for (int i = 1; i <= n ; i++) {
           
            ans+= i;

        }
        System.out.print(ans);

    }
}

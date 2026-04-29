import java.util.*;

public class plm24_FIND_STRICT_AVERAGE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double avg = (a+b)/2;
        
        if( avg > c)
            System.out.println("It is Greater");
        else
            System.out.println("Not Greater");
    }

}
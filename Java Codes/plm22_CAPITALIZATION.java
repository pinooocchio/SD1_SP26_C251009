import java.util.*;

class plm22_CAPITALIZATION 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(s); 
    }
}
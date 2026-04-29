import java.util.*;
class plm21_TOO_LONG_WORD
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if(s.length() > 10 )
        {
            System.out.print(s.charAt(0));
            System.out.print(s.length()-2);
            System.out.print(s.charAt(s.length()-1));
        }
        else
            System.out.print(s);
    } 
}
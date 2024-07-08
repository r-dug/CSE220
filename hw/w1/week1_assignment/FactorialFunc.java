
/**
 * Write a description of class hello_world here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class FactorialFunc
{
    public static void main ()
    {   
        int n;
        int n_factorial = 1;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Input a positive number, n.  I will return its factorial value (n!): ");
        
        n = scan.nextInt();
        final int n_orig = n;
        System.out.println();
        if (n<0)
        {
            System.out.println("Sorry, but the value for n must be positive.");
        }else if (n==0)
        {
            System.out.println(n_orig+"! = "+ 0);
        }
        else
        {
            while (n > 1)
            {
                n_factorial *= n;
                n--;
            }
            System.out.println(n_orig+"! = "+ n_factorial);
        }
        
    }
}

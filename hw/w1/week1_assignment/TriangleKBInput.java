
/**
 * Write a description of class TriangleKBInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TriangleKBInput
{

    /**
     * 
     * methods:
     * semiperimeter -  calculates the semiperimeter of a triangle
     * 
     * heronsForm -     calculates the area of a triangle using Heron's Formula
     * 
     * main -           prompt user for input and read input into vars a, b, c
     *                  calculate the semiperimeter and assign it to variable
     *                  calculate area using heronForm
     *                  print area
     * 
     */
    
    static double semiPerim(double a, double b, double c)
    {
        double s;
        s = (a+b+c)/2;
        return s;
    }
    
    static double heronsForm(double a, double b, double c, double s)
    {
        double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
    public static void main(String[] args) throws Exception
    {
        double a, b, c, semi_perimeter, area;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter triangle side a: ");
        a = scan.nextInt();
        System.out.println();
        
        System.out.print("Enter triangle side b: ");
        b = scan.nextInt();
        System.out.println();
        
        System.out.print("Enter triangle side c: ");
        c = scan.nextInt();
        System.out.println();
        
        semi_perimeter = semiPerim( a,  b,  c );
        area = heronsForm( a, b, c, semi_perimeter );
        
        System.out.println("The triangle has semiperimeter of " 
                            + semi_perimeter);
        System.out.println("The triangle has area " 
                            + area);
    }
}

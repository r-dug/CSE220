import java.util.Scanner;
import java.lang.Math;

public class TriangleKBInput {
    static double semiPerimeter (double a, double b, double c){
        double s;
        s = (a+b+c)/2;
        return s;
    }
    static double heronsForm (double s, double a, double b, double c){
        double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public static void main(String[] args) throws Exception{
        // variables for triangle sides, semiperimeter, and area        
        double a, b, c, s, area;
        // initialize keyboard input scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to input values for sides and scan for input
        System.out.print("Enter triangle side a: ");
        a = input.nextDouble();
        System.out.print("Enter triangle side b: ");
        b = input.nextDouble();
        System.out.print("Enter triangle side c: ");
        c = input.nextDouble();

        // calculate semiperimeter
        s = semiPerimeter (a, b, c);
        // calculate area using herons formula
        area = heronsForm(s, a, b, c);

        // output results
        System.out.println("\nSemiperimpeter of triangle with sides a="+a+", b="+b+", c="+c+": "+s);
        System.out.println("\nArea of triangle with sides a="+a+", b="+b+", c="+c+": "+area+"\n");
    }
}

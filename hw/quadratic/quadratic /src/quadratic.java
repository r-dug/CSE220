

import java.util.Scanner;
public class quadratic {
    static double discriminant(double a, double b, double c)
    {
        double d = (Math.pow(b, 2)) - (4*a*c);
        return d;
    }
    static double [] roots(double a, double b, double d)
    {
        double root1, root2;
        root1 = (-1*b+Math.sqrt(d)) / 2*a;
        root2 = (-1*b-Math.sqrt(d)) / 2*a;
        double[] roots = {root1, root2};

        return roots;
    }
    public static void main(String[] args) throws Exception {
        double a, b, c, d;
        double roots[];
        Scanner input = new Scanner(System.in);
        System.out.println("This program solves for x, given the quadratic formula (ax^2 + bx + c = 0) \n\tinput the coefficients...");
        System.out.print("a: ");
        a = input.nextDouble();
        System.out.print("b: ");
        b = input.nextDouble();
        System.out.print("c: ");
        c = input.nextDouble();
        d = discriminant(a, b, c);

        if (d < 0 )
        {
            System.out.println("These roots are imaginary, because the discriminant ("+d+") is negative.");
        }
        else
        {
            roots = roots(a, b, d);
            System.out.println("Your roots are: "+roots[0]+" & "+ roots[1]);
        }
    }
}



/**
 * Write a description of class TriangleKBInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class TriangleFileInput
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
        double[] sides = {0,0,0};
        try
        {
            File triangleFile = new File("TriangleSides.txt");
            Scanner scan = new Scanner (triangleFile);
            int i = 0;
            double val;
            while (scan.hasNextLine()) {
                if (scan.hasNextInt()) {
                    sides[i] = scan.nextInt();

                } else if(scan.hasNextDouble()) {
                    sides[i] = scan.nextDouble();

                } else {
                    scan.next(); // discard 
                }
                i++;
            } 
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred reading the file.");
            e.printStackTrace();
        }
        System.out.print("Reading input from file...");
        a = sides [0];
        b = sides[1];
        c = sides[2];
        System.out.println();
        
        semi_perimeter = semiPerim( a,  b,  c);
        area = heronsForm( a, b, c, semi_perimeter);
        
        System.out.println("The triangle has semiperimeter of " + semi_perimeter);
        System.out.println("The triangle has area " + area);
    }
}
import java.util.Scanner;
import java.io.*;

public class TriangleFileInput {
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
    public static void main(String[] args) throws Exception {
        // array to store values of triangleSides.txt
        double[] sides = {0,0,0};
        // variables for triangle sides, semiperimeter, and area
        double a, b, c, s, area;
        // index variable for while loop
        int i = 0;
        // get cwd 
        String cwd = System.getProperty("user.dir");
        // append relative path to triangleSides.txt from working dir of java execution
        String fileUrl = cwd+"/src/triangleSides.txt";
        // instantiate a new file scanning Scanner object
        Scanner fileScan = new Scanner(new File(fileUrl));
        // loop through file with file scanner and assign values to sides array
        while (fileScan.hasNext()){
            sides[i]=(fileScan.nextDouble());
            ++i;
        }
        // assign sides array vals to vars a, b, c ... not entirely necessary.
        a = sides[0];
        b = sides[1];
        c = sides[2];
        // calculate semiperimeter
        s = semiPerimeter(a, b, c);
        // calculate area using herons formula
        area = heronsForm(s, a, b, c);
        
        // output results
        System.out.println("\nSemiperimpeter of triangle with sides a="+a+", b="+b+", c="+c+": "+s);
        System.out.println("\nArea of triangle with sides a="+a+", b="+b+", c="+c+": "+area+"\n");
    }
}

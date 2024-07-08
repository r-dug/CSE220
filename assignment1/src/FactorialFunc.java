import java.util.Scanner;
public class FactorialFunc {
    
    
    static int factorial(int n){
        int n_fact = 1, i = 1;
        if( n == 0 || n < 0 ){
            System.out.println("Sorry, but the value for n must be positive.");
            return 0;
        }
        else{
            while ( i<n ){
                n_fact *= i;
                ++i;
            }
        }
        return n_fact;
    }
    public static void main(String[] args) throws Exception {
        int n, n_fact;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive number, n.  I will return its factorial value (n!): ");
        n = input.nextInt();
        n_fact = factorial(n);
        if ( n_fact != 0){
            System.out.println(n+"! = "+n_fact);
        }
    }
}

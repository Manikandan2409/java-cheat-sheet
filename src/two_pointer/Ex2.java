package two_pointer;

import java.util.Scanner;
// factorial of n numbers
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to find factorial ");
        long n = in.nextInt();
        in.close();
        System.out.println("Factorial of "+n +" : "+ factorial(n));
    }   
    private static  long factorial(long n){

        if (n<=1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}

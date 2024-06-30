package basics;

import java.util.Scanner;

// Reverse a number
public class Ex4 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n = in.nextInt();
        int rev = reverseNumber(n);
        System.out.println("Reverse number :" + rev);
        in.close();
    
    }
    static int reverseNumber(int n){
        int rev =0;

        while (n!=0) {
            int t = n%10;
            rev= (rev* 10)+t;
            n/=10;
        }
        return rev;
    }
    
}

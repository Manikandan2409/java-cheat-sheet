package basics;

import java.util.Scanner;

// find last digit of number
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find last digit of number");

        int n = in.nextInt();
        in.close();
        if (n<9 && n>-9) {
            System.out.println("Last digit :"+ n);
            return;
        }
        System.out.println("Last digit  :"+ Math.abs(n % 10));
        
    }
    
}

package basics;

import java.util.Scanner;

// Palindrome of a number
public class Ex10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num to find palindrome :) ");
        int n = in.nextInt();

        if (isPalindrome(n))  System.out.println(n+" is Palindrome");
        else System.out.println(n+" is not a Palindrome");   
    
    }


    private static boolean isPalindrome(int n){
        int t =n;
        int r =0;
        while (t!= 0) {
            int tmp = t%10;
            r=(r*10) + tmp;
            t/=10;
        }
        if (n == r)   return true;
        else return false;
    }
    
}

package two_pointer;

import java.util.Scanner;

// Fibonocii Series
public class Ex3 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number to find fibonocii :");
         int n = in.nextInt();
         in.close();
         System.out.println("Fibonocii Series :"+ fibonocii(n));
    }

    private static long fibonocii(long n){
        if (n<=0) return -1;
        else if (n ==1)  return 1;
        else if (n==2) return 1;
        else  return fibonocii(n-1)+ fibonocii(n-2);

    }
}

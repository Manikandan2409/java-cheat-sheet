package basics;

import java.util.Scanner;

// Count number of digits in number
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Number of digits :"+countNumber(n));
        in.close();
    }

    static int countNumber(int n) {
        int count = 0;
        n = Math.abs(n);
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    } 
}

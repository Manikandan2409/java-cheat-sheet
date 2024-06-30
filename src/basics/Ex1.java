package basics;

import java.util.Scanner;

// odd or even
class Ex1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n to check the number is odd or even");
        int n = in.nextInt();
        if (isEven(n)) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        in.close();
    }

    static boolean isEven(int n){
        return (n & 1) ==0;
    }
    static boolean isOdd(int n){
        return (n & 1)!= 0;
    }
}
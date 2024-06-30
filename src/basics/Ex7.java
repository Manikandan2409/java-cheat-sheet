package basics;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Find all divisors of number
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int n = in.nextInt();

        List<Integer> divisors = IntStream.range(1, n+1)
        .filter(i-> n % i ==0)
        .boxed()
        .collect(Collectors.toList());

        System.out.println("Divisiors :"+ divisors);
    }    
}

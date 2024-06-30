package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Range of prime

public class Ex8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Range to find prime:");
        List<Integer> primes = new ArrayList<>();
        
        int n = in.nextInt();
        
        // for(int i = 2; i <= n; i++) {
        //     if (isPrime(i)) {
        //         primes.add(i);
        //     }
        // }
    
        Map<Boolean,List<Integer>>  partitionNumbers = IntStream.rangeClosed(2, n)
        .boxed()
        .collect(Collectors.partitioningBy(num-> isPrimeRecursive(num, 2)));

        List<Integer> prime = partitionNumbers.get(true);
        List<Integer> nonprime = partitionNumbers.get(false);

        System.out.println("Prime numbers up to " + n + ": " + prime +" \n "+ nonprime);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeRecursive(int num, int divisor) {
        if (num <= 1) return false;
        if (divisor > Math.sqrt(num)) return true;
        if (num % divisor == 0) return false;
        return isPrimeRecursive(num, divisor + 1);
    }
}

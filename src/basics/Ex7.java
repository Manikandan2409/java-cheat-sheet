package basics;

import java.util.LinkedList;
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
        in.close();
        System.out.println("Divisors +" + divisorsOfNumber(n));
        List<Integer> divisors = IntStream.range(1, n + 1)
                .filter(i -> n % i == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Divisiors :" + divisors);
    }

    public static List<Integer> divisorsOfNumber(int n) {
        List<Integer> values = new LinkedList<>();
        for (int i = 1; i <=n / 2; i++) {
            if (n % i == 0) {
                values.add(i);
            }
        }
        values.add(n);
        return (values);
    }
}

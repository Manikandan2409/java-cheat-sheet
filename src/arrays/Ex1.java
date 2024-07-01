package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


// array traversal
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter size of array :) ");
   
        int n = Integer.SIZE;
        long st = System.currentTimeMillis();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long et = System.currentTimeMillis();
        System.out.println("Array values  timing:)"+ (et-st));
        System.gc();
        st = System.currentTimeMillis();
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrList.add(i);
        }
        et = System.currentTimeMillis();
        System.out.println("Arraylist timing :) "+ (et- st));
        System.gc();

        st = System.currentTimeMillis();
        List<Integer> streamlist =  IntStream.range(0, n)
                                    .boxed()
                                    .collect(Collectors.toList());
        
        et = System.currentTimeMillis();
        System.out.println("Stream timing"+ (et-st));

        }

    
}

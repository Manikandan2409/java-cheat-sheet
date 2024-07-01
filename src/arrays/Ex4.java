package arrays;

import java.util.Arrays;

// Search an element
public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {234,34,546,67,78,980,546};
        int search = 546;
      
        Arrays.stream(arr)
        .filter(i-> i== search)
        .findFirst()
        .ifPresent(i->System.out.println(i));
    }
    
}

package arrays;
// missing element

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex5 {
    public static void main(String[] args) {
        int[] arr = {45,46,47,48,49,51,52};
        int expectedSum=IntStream.range(arr[0], arr[arr.length-1]+1).sum();
        int actualSum = Arrays.stream(arr).sum();
        System.out.println("Missing value "+(expectedSum-actualSum));
    }
    
}

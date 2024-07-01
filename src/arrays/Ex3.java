package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
// 3rd largest  , kth largest
public class Ex3 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 5, 4};
        int k = 4;
        
        try {
            int kthLargest = findKthLargestUnique(nums, k);
            System.out.println("The " + k + "-th largest unique element is " + kthLargest);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int findKthLargestUnique(int[] nums, int k) {
        Set<Integer> uniqueNums = Arrays.stream(nums)
                                        .boxed()
                                        .collect(Collectors.toCollection(TreeSet::new)); 
        if (uniqueNums.size() < k) {
            throw new IllegalArgumentException("Not enough unique elements to find the " + k + "-th largest.");
        }

        Integer[] uniqueArray = uniqueNums.toArray( new Integer[0]);
        return uniqueArray[uniqueArray.length - k];
    }
}

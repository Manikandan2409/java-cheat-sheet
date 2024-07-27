package binarysearch;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] { 45, 46, 48, 49, 50 }));
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length - 1];
        int initvalue = (end - start + 1) / 2 * (start + end);
        int avalue = Arrays.stream(nums).sum();
        if (initvalue == avalue) {
        
        }
        return  initvalue - avalue;
    }

}

package arrays;

import java.util.Arrays;

// Rotate array by 1
public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {12,34,45,67,78,54};
        long st = System.nanoTime();
        rotateArray(arr);
        long et = System.nanoTime();
        System.out.println("Diff: "+(et-st));
    }
    static void rotateArray(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        int le = arr[arr.length-1];
        
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = le;

        System.out.println("Arrays :"+ Arrays.toString(arr));
    }
}

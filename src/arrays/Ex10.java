package arrays;

import java.util.Arrays;

// Reverse array elements k times
public class Ex10 {
    public static void main(String[] args) {
        int[] arr ={23,34,54,64,3,43,76,87,90,1234,76};
        int rotation =1;
        rotateArray(arr,rotation);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int[] arr,int k){
            if (arr== null || arr.length == 1) {
                return;
            } 
            reverse(arr, 0, k-1);

            reverse(arr, k, arr.length-1);
            reverse(arr, 0, arr.length-1);

    }

    static  void reverse(int[] arr,int start,int end){
            while (start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
    
}

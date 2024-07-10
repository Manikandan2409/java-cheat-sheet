package binarysearch;

import java.util.Arrays;

//Search in a sorted array(Efficiently -> So learn binary search for this)
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {23,43,12,64,76,34,9,89,7};
        int start = 0;
        int end = arr.length-1;
        int search =64;
        Arrays.sort(arr);
        System.out.println("Sorted: "+ Arrays.toString(arr));
        while (start<=end) {
          int  mid= start +(end- start)/2;
          System.out.println(mid+ " "+ arr[mid]);
            if (arr[mid] == search) {
                System.out.println("Element found");
                return;
            }
            
            if (arr[mid] < search) {
                start = mid +1;
            }else  {
                end =mid-1;
            }
        }
        System.out.println("Element not found");
    }
}

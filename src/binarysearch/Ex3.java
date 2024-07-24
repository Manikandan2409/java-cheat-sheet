package binarysearch;

import java.util.ArrayList;
import java.util.List;

// Find first and last occurence of element in sorted array
public class Ex3 {
   public static void main(String[] args) {
    int[] arr = {2,3,4,56,76,87,54,90,87};
    int search =87;
        firstOccurence(arr,search);
   } 
   private static  void firstOccurence(int[] arr,int search){
        int start = 0;
        int end =arr.length-1;
        List<Integer> values = new ArrayList<>();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == search) {
                values.add(mid);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(values);
   }
}

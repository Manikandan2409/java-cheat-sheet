package two_pointer;

import java.util.Arrays;
import java.util.HashSet;

// Union of 2 array
public class Ex7 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        unionArray(arr1, arr2);
        unionArrayHash(arr1, arr2);
    }
    private static  void unionArrayHash(int[] arr1,int[] arr2){
        HashSet<Integer> val = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            val.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            val.add(arr2[i]);
        }
        Integer[] union = val.toArray(new Integer[0]);
        System.out.println(Arrays.toString(union));
    }
    private static  void unionArray(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int i;
        for ( i = 0; i < arr1.length; i++) {
            res[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            if (!isPresent(arr1,arr2[j])) {
                res[i++]=arr2[j];
            }        
        }

        for (int j = 0; j < i; j++) {
            System.out.print(res[j]+" ");
        }
    }
    private static boolean isPresent(int[] arr,int el){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== el) {
                return true;
            }
        }
        return false;
    }

}

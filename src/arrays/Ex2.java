package arrays;

import java.util.Arrays;
import java.util.Random;

// Min and max of an array
public class Ex2 {
    public static void main(String[] args) {
         Random random = new Random();
         int size =10;
         int[] arr = new int[size];
        
         for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(20);
         }
        int max = maxValue(arr);
        int Min = minValue(arr);
         System.out.println("aRRAY:) "+ Arrays.toString(arr)+ " \n max: "+ max+"\n min: "+ Min);
    }

    private static int minValue(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if (min> i) {
                min =i;
            }
        }
        return min;
    }
    private static int maxValue(int[] arr){
        int max = arr[0];
        for (int i : arr) {
           if (max< i) {
               max =i;
           }
        }
        return max;
    }
}

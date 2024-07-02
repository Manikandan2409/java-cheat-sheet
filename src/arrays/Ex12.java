package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Count the frequency
public class Ex12 {
    public static void main(String[] args) {
        int[] arr ={23,23,34,54,65,45,34,45};

        long st = System.nanoTime();
        countStreamFrequency(arr);
        long et = System.nanoTime();
        System.out.println("Streams:"+(et-st));
        st = System.nanoTime();
        countCollectionFrequency(arr);
        et = System.nanoTime();
        System.out.println("Streams:"+(et-st));
    }
    static void countStreamFrequency(int[] arr){
        Map<Integer,Integer> frequency =  Arrays.stream(arr)
        .boxed()
        .collect(HashMap::new ,(map,num)-> map.put(num,map.getOrDefault(num,0)+1),HashMap::putAll);
        System.out.println(frequency);
    }
    static void countCollectionFrequency(int[] arr){
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i : arr) {
            frequency.put(i, frequency.getOrDefault(i, 0)+1);
        }
        System.out.println(frequency);
    }
    
}

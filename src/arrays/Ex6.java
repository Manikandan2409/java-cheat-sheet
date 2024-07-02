package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Repeating number
public class Ex6 {
    public static void main(String[] args) {
    
        int arr[] = {34,34,34,56,56,12,12,12,12,67,78};
        long st = System.currentTimeMillis();
        streamRepeat(arr);
        long et = System.currentTimeMillis();
        System.out.println("Streams :"+(et-st));
        System.out.println("Collection");
        st = System.currentTimeMillis();
        collectionRepeatation(arr);
        et = System.currentTimeMillis();
        System.out.println("Collection:"+(et-st));
        
    }

    static void streamRepeat(int[] arr){
        Map<Integer,Integer> repeat = Arrays.stream(arr)
        .boxed()
        .collect(HashMap::new ,(map,num)-> map.put(num,map.getOrDefault(num,0)+1),HashMap::putAll);
        
        repeat.entrySet()
        .stream()
        .filter(entry-> entry.getValue()> 1 )
        .forEach(System.out::println);
    }

    static void collectionRepeatation(int[] arr){
        Map<Integer,Integer> repeat = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            repeat.put(arr[i], repeat.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : repeat.entrySet()) {
            if (entry.getValue() >1) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }

    
}

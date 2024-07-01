package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Repeating number
public class Ex6 {
    public static void main(String[] args) {
    
        int arr[] = {34,34,34,56,56,12,12,12,12,67,78};
        Map<Integer,Integer> repeat = Arrays.stream(arr)
        .boxed()
        .collect(HashMap::new ,(map,num)-> map.put(num,map.getOrDefault(num,0)+1),HashMap::putAll);
        
        repeat.entrySet()
        .stream()
        .filter(entry-> entry.getValue()> 1 )
        .forEach(System.out::println);
    
    }
    
}

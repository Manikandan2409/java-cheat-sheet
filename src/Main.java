import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23,23,45,65,76};
        List<Integer> array = Arrays.stream(arr)
        .distinct()
        .boxed()
        .collect(Collectors.toList());
        System.out.println(array);
        
    }
    
}

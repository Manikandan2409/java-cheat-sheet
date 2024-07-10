package two_pointer;

import java.util.LinkedList;
import java.util.List;

// Pattern printing

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> result = new LinkedList<>();
        int n=56;
        generatePattern (n,n,result,false);
        System.out.println(result);
    }    
    private static void generatePattern(int cur,int original,List<Integer> result,boolean increasing){
        result.add(cur);
        if (cur<=0) {
            increasing = true;
        }
        if (increasing && cur == original) {
            return;
        }

        if (increasing) {
            generatePattern(cur+5, original, result, increasing);
        }else{
            generatePattern(cur-5, original, result, increasing);
        }
    }
}

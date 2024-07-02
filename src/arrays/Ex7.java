package arrays;

import java.util.Arrays;

public class Ex7 {

    public static void main(String[] args) {
        int[] arr ={0,1,0,0,0,1,1,2,2,};
        long st = System.nanoTime();

        streamSort012(arr);
        long et = System.nanoTime();
        System.out.println("Stream :"+ (et-st));

        st = System.nanoTime();
        primitiveSort012(arr);
        et = System.nanoTime();
        System.out.println("Arrays:"+ (et-st));
        

    }
    
    static void streamSort012(int[] arr){
      arr=  Arrays.stream(arr)
        .sorted()
        .toArray();
        System.out.println(Arrays.toString(arr));
    }
    static void primitiveSort012(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]) {
                    int tmp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        System.out.println("Arrays:"+ Arrays.toString(arr));
    }
}

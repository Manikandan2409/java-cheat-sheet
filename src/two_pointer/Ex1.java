package two_pointer;

//pair with given sum
public class Ex1 {
  public static void main(String[] args) {
    int[] arr ={1, 4, 45, 6, 10, 8};
    int sum =16;

    pairSum(arr,sum);
    int[] arr1={1, 2, 4, 3, 6};
    sum=10;
    pairSum(arr,sum);
  }  
  static void pairSum(int[] arr,int x){
    for(int i =0;i< arr.length-1;i++){
        for(int j=i;j<arr.length -1;j++){
            if (arr[i]+ arr[j] == x) {
                System.out.println("Element found at"+(i+1)+" "+(j+1));
                return;
            }
        }
    }
    System.out.println("Element not found");

  }
}

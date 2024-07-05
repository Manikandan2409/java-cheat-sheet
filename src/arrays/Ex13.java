package arrays;
//Subset of an array
public class Ex13 {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        int m = arr1.length;
        int n = arr2.length;
    if (isSubset(arr1, arr2, m, n)) {
        System.out.println("yes");
    }else{
        System.out.println("No");
    }
    }
    public static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }     
}

import java.util.Arrays;

class Solution {
    public static int trailingZeroes(int n) {
        if (n <= 1)
            return n;
        else
            return n * trailingZeroes(n - 1);
    }

    public static void moveByOne(int[] arr) {
        int f = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = f;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a += b - (b = a);
        System.out.println(a + " " + b);
        int[] arr = { 3, 34, 23, 54, 65 };
        moveByOne(arr);
    }
}
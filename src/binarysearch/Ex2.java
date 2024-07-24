package binarysearch;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {23, 43, 12, 64, 76, 34, 9, 89, 7};
        int x = 35;

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        // Greatest closer  or equal number near to x in  less value
        int floor = findFloor(arr, x);

        //  smallest or equal number near to x which is greater than the value of x
        int ceil = findCeil(arr, x);

        if (floor != -1) {
            System.out.println("Floor of " + x + " is " + floor);
        } else {
            System.out.println("Floor of " + x + " doesn't exist");
        }

        if (ceil != -1) {
            System.out.println("Ceil of " + x + " is " + ceil);
        } else {
            System.out.println("Ceil of " + x + " doesn't exist");
        }
    }

    public static int findFloor(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int floor = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] < x) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return floor;
    }

    public static int findCeil(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int ceil = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                ceil = arr[mid];
                end = mid - 1;
            }
        }
        return ceil;
    }
}

package binarysearch;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 54, 56, 76, 87, 90 };
        int search = 87;
        int[] result = firstAndLastOccurrence(arr, search);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    private static int[] firstAndLastOccurrence(int[] arr, int search) {
        int first = -1;
        int last = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == search) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == search) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] { first, last };
    }
}

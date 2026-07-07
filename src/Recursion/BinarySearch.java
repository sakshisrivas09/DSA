package Recursion;

public class BinarySearch {
    static int solve(int[] arr, int target, int start, int end) {
        int n = arr.length;
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            end = mid - 1;

        }
        if (arr[mid] < target) {
            start = mid + 1;
        }
        return solve(arr, target, start, end);

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int ans = solve(arr, target, 0, arr.length - 1);

        System.out.println(ans);

    }
}

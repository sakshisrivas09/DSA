package Array;

import java.util.HashMap;

public class GetMode {
    static void getmode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {

            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for (int i : freq.keySet()) {
// i will reperesent key
            System.out.println(i + " -> " + freq.get(i));
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5};
        getmode(arr);

    }
}

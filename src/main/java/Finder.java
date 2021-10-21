package main.java;

public class Finder {
    public static int binarySearch(int[] arr, int target) {
        int l = 0; // left
        int m = 0; // middle
        int r = arr.length - 1; // right

        while (l < r - 1) {
            m = (l + r) / 2;

            if (arr[m] == target) return m;
            else if (arr[m] > target) r = m;
            else l = m;
        }

        if (arr[l] == target) return l;
        if (arr[r] == target) return r;
        return -1;
    }
}

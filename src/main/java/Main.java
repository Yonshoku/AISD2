package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, 4, -5, 0, 0, 0, 213, 1, 1, -100, -1000, 105};

        System.out.println(Arrays.toString(Sorter.quickSort(arr, 0, arr.length - 1)));
        System.out.println(Finder.binarySearch(arr, 4));

        char[] arr_char = {'a', 'c', 'a', 'e', 'b', 'b', 'b', 'e', 'a'};
        System.out.println(Arrays.toString(Sorter.countingSort(arr_char)));
    }
}

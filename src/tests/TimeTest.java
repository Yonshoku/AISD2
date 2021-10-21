package tests;

import main.java.Sorter;

import java.util.Arrays;

public class TimeTest {
    int getRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    int[] generateArray(int length, int min, int max) {
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = getRandom(min, max);
        }

        return result;
    }

    long[][] measure(int launches) {
        int[] sizes = {10, 100, 1000, 10000, 100000};
        long[][] result = new long[2][sizes.length];
        long[] quickSortLocalResults = new long[launches];
        long[] bubbleSortLocalResults = new long[launches];
        long start, finish;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < launches; j++) {
                // Generate array
                // arr1 = arr2
                int[] arr1 = generateArray(sizes[i], -1000, 1000);
                int[] arr2 = Arrays.copyOf(arr1, arr1.length);

                // Test bubbleSort
                System.out.println("start bubble sort with size " + sizes[i]);
                start = System.currentTimeMillis();
                Sorter.bubbleSort(arr1);
                finish = System.currentTimeMillis();

                bubbleSortLocalResults[j] = finish - start;

                System.out.println("start quick sort with size " + sizes[i]);
                // Test quickSort
                start = System.currentTimeMillis();
                Sorter.quickSort(arr2, 0, arr2.length - 1);
                finish = System.currentTimeMillis();

                quickSortLocalResults[j] = finish - start;
            }

            // Get average time for bubbleSort for current arr size
            long sum = 0;
            for (long b : bubbleSortLocalResults) {
                sum += b;
            }

            result[0][i] = (long) sum / launches;

            // Get average time for quickSort for current arr size
            sum = 0;
            for (long q : quickSortLocalResults) {
                sum += q;
            }

            result[1][i] = (long) sum / launches;
        }

        return result;
    }

}

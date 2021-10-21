package main.java;

public class Sorter {

    public static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr = swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    public static int[] bogoSort(int[] arr) {
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                arr = swap(arr, i, i + 1);

                i = 0;
            } else {
                i++;
            }
        }

        return arr;
    }

    public static int[] quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int p = arr[(l + r) / 2]; // pivot
            int i = l, j = r;

            while (i <= j) {
                while (arr[i] < p) i++;
                while (arr[j] > p) j--;

                if (i >= j) break;
                arr = swap(arr, i++, j--);
            }

            quickSort(arr, l, j);
            quickSort(arr, j + 1, r);
        }

        return arr;
    }

    public static char[] countingSort(char[] arr) {
        int RANGE = 26;
        int CHAR_SHIFT = 97;
        int[] counts = new int[RANGE];

        for (int i = 0; i < arr.length; i++) {
            counts[((int) arr[i]) - CHAR_SHIFT]++;
        }

        int cur_index = 0;

        for (int i = 0; i < RANGE; i++) {
            for (int j = 0; j < counts[i]; j++) {
                arr[cur_index] = (char) (i + CHAR_SHIFT);
                cur_index++;
            }
        }

        return arr;
    }
}

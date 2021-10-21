package tests;
import main.java.Sorter;
import main.java.Finder;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SorterFinderTest {
    int[] arr1, arr2, arr3, arr4;
    char[] char_arr1, char_arr2;

    int[] arr1_sorted = new int[]{1, 2, 3, 4, 5, 6};
    int[] arr2_sorted = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
    int[] arr3_sorted = new int[]{-5, -5, -5, 5, 5, 5, 15, 16, 17, 18};
    int[] arr4_sorted = new int[]{-200, -100};

    char[] char_arr1_sorted = new char[]{'a', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'f', 'z'};
    char[] char_arr2_sorted = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};

    @Before
    public void setUp() {
        arr1 = new int[]{2, 1, 3, 4, 6, 5};
        arr2 = new int[]{1, 0, 0, 0, 0, 1, 1, 1, 0, 1};
        arr3 = new int[]{-5, 5, -5, 5, -5, 17, 18, 16, 15, 5};
        arr4 = new int[]{-100, -200};

        char_arr1 = new char[]{'a', 'a', 'c', 'a', 'b', 'c', 'f', 'z', 'c', 'a', 'b'};
        char_arr2 = new char[]{'f', 'e', 'd', 'c', 'b', 'a'};
    }

    @Test
    public void testBogoSort() {
        assertArrayEquals(Sorter.bogoSort(arr1), arr1_sorted);
        assertArrayEquals(Sorter.bogoSort(arr2), arr2_sorted);
        assertArrayEquals(Sorter.bogoSort(arr3), arr3_sorted);
        assertArrayEquals(Sorter.bogoSort(arr4), arr4_sorted);
    }

    @Test
    public void testBubbleSort() {
        assertArrayEquals(Sorter.bogoSort(arr1), arr1_sorted);
        assertArrayEquals(Sorter.bogoSort(arr2), arr2_sorted);
        assertArrayEquals(Sorter.bogoSort(arr3), arr3_sorted);
        assertArrayEquals(Sorter.bogoSort(arr4), arr4_sorted);
    }

    @Test
    public void testQuickSort() {
        assertArrayEquals(Sorter.bogoSort(arr1), arr1_sorted);
        assertArrayEquals(Sorter.bogoSort(arr2), arr2_sorted);
        assertArrayEquals(Sorter.bogoSort(arr3), arr3_sorted);
        assertArrayEquals(Sorter.bogoSort(arr4), arr4_sorted);
    }

    @Test
    public void testCountingSort() {
        assertArrayEquals(Sorter.countingSort(char_arr1), char_arr1_sorted);
        assertArrayEquals(Sorter.countingSort(char_arr2), char_arr2_sorted);
    }

    @Test
    public void testBinarySearch() {
        assertEquals(Finder.binarySearch(arr1_sorted, 4), 3);
        assertEquals(Finder.binarySearch(arr2_sorted, 0), 4);
        assertEquals(Finder.binarySearch(arr3_sorted, 16), 7);
        assertEquals(Finder.binarySearch(arr4_sorted, -100), 1);
    }

}

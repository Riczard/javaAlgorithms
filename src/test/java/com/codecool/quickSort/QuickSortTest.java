package com.codecool.quickSort;

import com.codecool.mergeSort.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        QuickSort.quickSort(actual);
        assertArrayEquals(expected, actual);
    }
}
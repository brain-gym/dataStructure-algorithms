package com.company.utils.algorithm;

import com.company.dataStructure.Array;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        int[] arr = new int[]{7, 3, 5, 9, 1, 4, 10, 1, 2, 89, 2};
        int[] sorted = QuickSort.sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
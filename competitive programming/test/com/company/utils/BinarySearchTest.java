package com.company.utils;

import com.company.dataStructure.Array;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void binarySearch() {
        Array arr = new Array();
        arr.createArray();
        int index = BinarySearch.binarySearch(arr.numArray, 0, arr.numArray.length - 1, 9);
        System.out.println(index);
    }

    @Test
    void findFirstAndLast() {
        Array arr = new Array();
        arr.createArray();
        BinarySearch.findFirstAndLastOccurrence(arr.numArray, 5);
    }


    @Test
    void findFirstOccurrence() {
        Array arr = new Array();
        arr.createArray();
        int lastIndex = BinarySearch.findLastOccurrence(arr.numArray, 0, arr.numArray.length - 1, 5);
        System.out.println(lastIndex);

        int index = BinarySearch.findFirstOccurrence(arr.numArray, 0, arr.numArray.length - 1, 5);
        System.out.println(index);

    }
}
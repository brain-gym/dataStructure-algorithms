package com.company.utils;

import com.company.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void binarySearch() {
        Array arr = new Array();
        arr.createArray();
        int index = Search.binarySearch(arr.numArray, 0, arr.numArray.length - 1, 9);
        System.out.println(index);
    }

    @Test
    void findFirstAndLast() {
        Array arr = new Array();
        arr.createArray();
        Search.findFirstAndLastOccurrence(arr.numArray, 5);
    }


    @Test
    void findFirstOccurrence() {
        Array arr = new Array();
        arr.createArray();
        int lastIndex = Search.findLastOccurrence(arr.numArray, 0, arr.numArray.length - 1, 5);
        System.out.println(lastIndex);

        int index = Search.findFirstOccurrence(arr.numArray, 0, arr.numArray.length - 1, 5);
        System.out.println(index);

    }
}
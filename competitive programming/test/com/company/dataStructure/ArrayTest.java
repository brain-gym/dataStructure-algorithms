package com.company.dataStructure;

import org.junit.jupiter.api.Test;

class ArrayTest {

    @Test
    void rotateArray() {
        Array arr = new Array();
        arr.createArray();
        arr.rotateClockWise(6);
        arr.print();
    }

    @Test
    void anotherRotateArray() {
        Array arr = new Array();
        arr.createArray();
        arr.rotateAntiClockwise(3);
        arr.print();
    }

    @Test
    void reverseArray() {
        Array arr = new Array();
        arr.createArray();
        arr.reverseArray();
        arr.print();
    }

    @Test
    void anotherReverseArray() {
        Array arr = new Array();
        arr.createArray();
        arr.anotherReverse();
        arr.print();
    }

    @Test
    void shuffleArray() {
        Array arr = new Array();
        arr.createArray();
        arr.shuffleArray();
        arr.print();
    }

    @Test
    void deleteArray() {
        Array arr = new Array();
        arr.createArray();
        arr.deleteElement(3);
        arr.print();
    }

    @Test
    void findPairSumZero() {
        Array arr = new Array();
        arr.numArray = new int[]{-3, -2, -1, 0, 1, 2, 5};
        arr.findPairWithSum(0);
    }

    @Test
    void findPairSum() {
        Array arr = new Array();
        arr.createArray();
        arr.findPairWithSum(10);
    }

    @Test
    void findTheMissingNum() {
        Array arr = new Array();
        int missingNumber = 50;
        arr.numArray = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i != missingNumber) {
                arr.numArray[i] = i;
            }
        }
        System.out.println(arr.findTheMissingNumberBetweenOneToHundred());
    }

    @Test
    void findMinAndMaxElementWithoutSorting() {
        Array arr = new Array();
        arr.numArray = new int[]{10, -2147483647, 40, 2147483647};
        arr.findMinAndMaxElementWithoutSorting();
    }
}
package com.company.utils;

public class Search {


    public static int binarySearch(int[] arr, int leftPointer, int rightPointer, int numToFind) {
        if (rightPointer >= leftPointer) {
            int mid = leftPointer + (rightPointer - leftPointer) / 2;
            if (arr[mid] == numToFind) {
                return mid;
            }
            if (arr[mid] > numToFind) {
                return binarySearch(arr, leftPointer, mid - 1, numToFind);

            }
            return binarySearch(arr, mid + 1, rightPointer, numToFind);

        }
        return -1;
    }


    public static void findFirstAndLastOccurrence(int[] arr, int numToFind) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numToFind) {
                if (first < 0) {
                    first = i;
                    last = i;
                } else {
                    last = last + 1;
                }
            }
        }
        System.out.println(first + "," + last);
    }


    public static int findFirstOccurrence(int[] arr, int leftPointer, int rightPointer, int numToFind) {
        if (leftPointer <= rightPointer) {
            int mid = leftPointer + (rightPointer - leftPointer) / 2;
            if (arr[mid] == numToFind && (mid == 0 || arr[mid - 1] < numToFind)) {
                return mid;
            }
            if (numToFind > arr[mid]) {
                return findFirstOccurrence(arr, mid + 1, rightPointer, numToFind);
            }
            return findFirstOccurrence(arr, leftPointer, mid - 1, numToFind);
        }
        return -1;
    }


    public static int findLastOccurrence(int[] arr, int leftPointer, int rightPointer, int numToFind) {

        if (leftPointer <= rightPointer) {
            int mid = leftPointer + (rightPointer - leftPointer) / 2;

            if (arr[mid] == numToFind && (mid == (arr.length - 1) || arr[mid + 1] > numToFind)) {
                return mid;
            } else if (numToFind < arr[mid]) {
                return findLastOccurrence(arr, leftPointer, mid - 1, numToFind);
            } else {
                return findLastOccurrence(arr, mid + 1, rightPointer, numToFind);
            }
        }

        return -1;
    }

}

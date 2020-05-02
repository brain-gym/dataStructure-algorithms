package com.company.utils.algorithm;

public class QuickSort {
    public static int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int leftPointer, int rightPointer) {
        if (rightPointer <= leftPointer) return;
        int partitionIndex = partition(arr, leftPointer, rightPointer);
        quickSort(arr, leftPointer, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, rightPointer);
    }

    private static int partition(int[] arr, int leftPointer, int rightPointer) {
        int i = leftPointer;
        int j = rightPointer + 1;
        while (true) {
            while (arr[++i] < arr[leftPointer]) {
                if (i == rightPointer) break; //to make sure not to run off the right end of the array
            }
            while (arr[leftPointer] < arr[--j]) {
                if (i == rightPointer) break; //to make sure not to run off the left end of the array
            }
            if (i >= j) break;
            swap(arr, i, j);
        }
        swap(arr, leftPointer, j);
        return j;
    }


    private static void swap(int[] arr, int leftPointer, int rightPointer) {
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[rightPointer];
        arr[rightPointer] = temp;
    }

}

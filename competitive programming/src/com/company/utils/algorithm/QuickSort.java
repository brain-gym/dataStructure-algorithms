package com.company.utils.algorithm;

public class QuickSort {
    public static int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }


    public static int[] reverseSort(int[] arr) {
        quickSortReverse(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int leftPointer, int rightPointer) {
        if (rightPointer <= leftPointer) return;
        int partitionIndex = partition(arr, leftPointer, rightPointer);
        quickSort(arr, leftPointer, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, rightPointer);
    }

    private static void quickSortReverse(int[] arr, int leftPointer, int rightPointer) {
        if (rightPointer <= leftPointer) return;
        int partitionIndex = partitionReverse(arr, leftPointer, rightPointer);
        quickSortReverse(arr, leftPointer, partitionIndex - 1);
        quickSortReverse(arr, partitionIndex + 1, rightPointer);
    }

    private static int partitionReverse(int[] arr, int leftPointer, int rightPointer) {
        int i = leftPointer;
        int j = rightPointer + 1;
        while (true) {
            while (arr[++i] > arr[leftPointer]) {
                if (i == rightPointer) break; //to make sure not to run off the right end of the array
            }
            while (arr[leftPointer] > arr[--j]) {
                if (i == rightPointer) break; //to make sure not to run off the left end of the array
            }
            if (i >= j) break;
            swap(arr, i, j);
        }
        swap(arr, leftPointer, j);
        return j;
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


    private static int partitionDiff(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    private static void swap(int[] arr, int leftPointer, int rightPointer) {
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[rightPointer];
        arr[rightPointer] = temp;
    }

}

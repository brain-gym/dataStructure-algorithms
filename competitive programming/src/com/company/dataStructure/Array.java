package com.company.dataStructure;

import javax.management.MBeanTrustPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array {
    public int numArray[];

    public void createArray() {
        numArray = new int[]{
                1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10
        };
    }

    public void print() {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

    public void rotateArray(int noOfSteps) {
        for (int i = 0; i < noOfSteps; i++) {
            int temp = numArray[0];
            for (int j = 0; j < numArray.length - 1; j++) {
                numArray[j] = numArray[j + 1];
            }
            numArray[numArray.length - 1] = temp;
        }
    }

    public void anotherRotateArray(int noOfSteps) {
        for (int i = 0; i < noOfSteps; i++) {
            int temp = numArray[numArray.length - 1];
            for (int j = numArray.length - 2; j >= 0; j--) {
                numArray[j + 1] = numArray[j];
            }
            numArray[0] = temp;
        }
    }

    public void anotherReverse() {
        recursiveReverse(numArray, 0, numArray.length - 1);
    }

    public void recursiveReverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = end;
        arr[end] = temp;
        recursiveReverse(arr, start + 1, end - 1);
    }


    public void reverse() {
        int length = numArray.length;
        int noOfSteps = length % 2 == 0 ? length / 2 : (length + 1) / 2;
        for (int i = 0; i < noOfSteps; i++) {
            int temp = numArray[i];
            numArray[i] = numArray[length - 1 - i];
            numArray[length - 1 - i] = temp;
        }
    }

    public void reverseArray() {
        int start = 0;
        int end = numArray.length - 1;

        while (start < end) {
            int temp = numArray[start];
            numArray[start] = numArray[end];
            numArray[end] = temp;
            start++;
            end--;
        }
    }

    public void deleteElement(int num) {
        int index = -1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == num) {
                index = i;
                break;
            }
        }

        for (int i = index; i < numArray.length - 1; i++) {
            numArray[i] = numArray[i + 1];
        }
    }


    public void shuffleArray() {
//        Random random = new Random();
//        for (int i = 0; i < numArray.length - 1; i++) {
//            int num = random.nextInt(numArray.length - 1 - i);
//            int tem = numArray[i];
//            numArray[i] = numArray[num];
//            numArray[num] = tem;
//        }

        Random r = new Random();

        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = numArray.length - 1; i > 0; i--) {

            // Pick a random index from 0 to i
            int j = r.nextInt(i + 1);

            // Swap arr[i] with the element at random index
            int temp = numArray[i];
            numArray[i] = numArray[j];
            numArray[j] = temp;
        }

    }
}


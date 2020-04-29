package com.company;

import org.junit.jupiter.api.Test;

class ArrayTest {

    @Test
    void rotateArray() {
        Array arr = new Array();
        arr.createArray();
        arr.rotateArray(6);
        arr.print();
    }

    @Test
    void anotherRotateArray(){
        Array arr = new Array();
        arr.createArray();
        arr.anotherRotateArray(3);
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
    void shuffleArray(){
        Array arr = new Array();
        arr.createArray();
        arr.shuffleArray();
        arr.print();
    }

    @Test
    void deleteArray(){
        Array arr = new Array();
        arr.createArray();
        arr.deleteElement(3);
        arr.print();
    }
}
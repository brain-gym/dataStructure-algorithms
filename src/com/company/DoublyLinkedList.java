package com.company;

public class DoublyLinkedList {
    DllNode head;

}

class DllNode {
    int data;
    DllNode prev;
    DllNode next;

    public DllNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

package com.company.misc;

import com.company.dataStructure.Node;

public class FloydCycleDetection {

    /* Floyd's cycle detection algorithm for linked list
     */
    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        if (slow == null || slow.next == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

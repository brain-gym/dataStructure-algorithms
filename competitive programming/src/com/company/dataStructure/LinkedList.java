package com.company.dataStructure;

public class LinkedList {
    Node head;

    public void printList() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    /*the complexity is O(1) as there is no complex work involved*/
    public void pushFront(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /*the complexity is O(1) as there is no complex work involved*/
    public void insertAfterNode(Node insertAfter, int data) {
        Node new_node = new Node(data);
        new_node.next = insertAfter.next;
        insertAfter.next = new_node;
    }

    /*the complexity of appending a data to end of linked-list is O(n)
     * because we need to traverse the entire list to find the end of  the list
     * To optimise this we can add a tail pointer like head pointer and the complexity falls down to  O(1)*/
    public void pushEnd(int data) {
        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (head.next != null) {
            current = current.next;
        }
        current.next = node;
    }


    public Node getNode(int pos) {
        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current;
    }

    /*the worst case complexity of deletion is O(n)
     * the best case would be O(1)*/
    public void deleteKey(int key) {
        Node prev = null;
        Node current = head;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        prev.next = current.next;
    }

    public void deleteAtPosition(int position) {
        Node current = head;
        Node prev = null;
        if (position == 0) {
            head = head.next;
        }

        for (int i = 0; i < position; i++) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }


    public int length() {
        int len = 0;
        Node current = head;
        while (current != null) {
            len++;
            current = current.next;
        }


        return len;
    }

    /* Returns count of nodes in linked list */
    private int getCountRec(Node node) {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }

    /* Wrapper over getCountRec() */
    public int getCount() {
        return getCountRec(head);
    }

    public boolean find(int x) {
        boolean found = false;
        Node current = head;
        while (current != null && !found) {
            found = current.data == x;
            current = current.next;
        }
        return found;
    }


    /*if the list of items are sorted in order*/
    public static void removeDuplicates(LinkedList linkedList) {
        Node curr = linkedList.head;

        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
//        Node current = linkedList.head;
//
//        while (current != null) {
//            Node prev = current;
//            if (current.next != null && current.next.data == prev.data) {
//                current.next = current.next.next;
//            }
//            current = current.next;
//        }
    }

    public static void reverseList(LinkedList linkedList) {
        Node curr = linkedList.head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        linkedList.head = prev;
    }


    public static Node getTheIntersectionNode(LinkedList listA, LinkedList listB) {
        Node intersection = null;
        Node startForA = listA.head;
        Node startForB = listB.head;
        int lengthToScan = Math.min(listA.length(), listB.length());
        if (listA.length() > listB.length()) {
            int diff = listA.length() - listB.length();
            for (int i = 0; i < diff; i++) {
                startForA = startForA.next;
            }
        } else if (listA.length() < listB.length()) {
            int diff = listB.length() - listA.length();
            for (int i = 0; i < diff; i++) {
                startForB = startForB.next;
            }
        }
        for (int i = 0; i < lengthToScan; i++) {
            if (startForA.next == startForB.next) {
                intersection = startForA.next;
                break;
            } else {
                startForA = startForA.next;
                startForB = startForB.next;
            }
        }
        return intersection;
    }

}


class Implementation {
    LinkedList linkedList = new LinkedList();

    public void createNewList() {
        linkedList.head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(2);
        Node four = new Node(3);
        Node five = new Node(3);
        Node six = new Node(4);

        six.next = second;
        five.next = six;
        four.next = five;
        third.next = four;
        second.next = third;
        linkedList.head.next = second;
    }

}
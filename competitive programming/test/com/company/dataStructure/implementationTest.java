package com.company.dataStructure;

import org.junit.jupiter.api.Test;

class implementationTest {
    @Test
    void testRemoveDuplicates(){
        Implementation imp = new Implementation();
        imp.createNewList();
        LinkedList.removeDuplicates(imp.linkedList);
        imp.linkedList.printList();
    }

    @Test
    void testReverseList(){
        Implementation imp = new Implementation();
        imp.createNewList();
        LinkedList.reverseList(imp.linkedList);
        imp.linkedList.printList();
    }

}
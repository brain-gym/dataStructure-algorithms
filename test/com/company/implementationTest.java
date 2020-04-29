package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class implementationTest {
    @Test
    void testRemoveDuplicates(){
        implementation imp = new implementation();
        imp.createNewList();
        imp.removeDuplicates(imp.linkedList);
        imp.linkedList.printList();
    }

    @Test
    void testReverseList(){
        implementation imp = new implementation();
        imp.createNewList();
        imp.reverseList(imp.linkedList);
        imp.linkedList.printList();
    }

}
package com.company.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class collatzConjectureTest {

    @Test
    void findTotalSteps() {
        System.out.println(collatzConjecture.findTotalSteps(7));
    }
}
package com.company.misc;

public class collatzConjecture {
    public static int findTotalSteps(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return 1 + findTotalSteps(n / 2);
        } else {
            return 1 + findTotalSteps((3 * n + 1));
        }
    }
}

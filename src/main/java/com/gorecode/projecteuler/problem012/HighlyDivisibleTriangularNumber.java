package com.gorecode.projecteuler.problem012;

import java.util.HashSet;
import java.util.Set;

public class HighlyDivisibleTriangularNumber {

    private static int countFactors(int number) {
        Set<Integer> factors = new HashSet<>();
        int sqrt = (int) Math.sqrt(number);

        for (int i = 1; i <= sqrt; ++i) {
            if (number % i == 0) {
                factors.add(i);
                factors.add(number / i);
            }
        }

        return factors.size();
    }

    private static int largestDivisor(final int size) {
        for (int value = 1, increment = 2; ; value += increment, increment++) {
            if (countFactors(value) > size) {
                return value;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(largestDivisor(500));
    }
}

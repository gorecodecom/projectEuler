package com.gorecode.projecteuler.problem003;

public class LargestPrimeFactor {

    public static long largestPrimeFactor(long number) {
        long i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--; }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }
}

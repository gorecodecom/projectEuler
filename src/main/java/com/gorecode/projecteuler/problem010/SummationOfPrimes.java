package com.gorecode.projecteuler.problem010;

public class SummationOfPrimes {
    public static boolean checkPrime(long number) {
        int counter = 0;
        long square = (long) Math.sqrt(number);

        for (long i = 1; i <= square; i++) {
            if (number % i == 0) counter ++;
            if (counter > 1) return false;
        }

        return true;
    }

    public static long summationOfPrimes(long primes) {
        long prime = 0;

        for (long i = 2; i < primes - 1; i++) {
            if (checkPrime(i)) {
                prime = prime + i;
            }
        }

        return prime;
    }

    public static void main(String[] args) {
        System.out.println(summationOfPrimes(2000000L));
    }
}

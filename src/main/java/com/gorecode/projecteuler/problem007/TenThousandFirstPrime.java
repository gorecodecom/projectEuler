package com.gorecode.projecteuler.problem007;

public class TenThousandFirstPrime {
    private static boolean checkPrime(long number) {
        long counter = 0;
        long square = (long) Math.sqrt(number);

        for (long i = 1; i <= square; i++) {
            if (number % i == 0) counter ++;
            if (counter > 1) return false;
        }

        return true;
    }

    private  static long findLargePrime(long limit) {
        long counter = 1;
        long prime = 0;

        for (long i = 2; counter <= limit; i++) {
            if (checkPrime(i)) {
                prime = i;
                counter++;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(findLargePrime(10001));
    }
}

package com.gorecode.projecteuler.problem007;

public class TenThousandFirstPrime {
    public static boolean checkPrime(int number) {
        int counter = 0;
        int square = (int) Math.sqrt(number);

        for (int i = 1; i <= square; i++) {
            if (number % i == 0) counter ++;
            if (counter > 1) return false;
        }

        return true;
    }

    public  static long findLargePrime(int limit) {
        int counter = 1;
        int prime = 0;

        for (int i = 2; counter <= limit; i++) {
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

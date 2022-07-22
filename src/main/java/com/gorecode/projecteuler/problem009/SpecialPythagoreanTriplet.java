package com.gorecode.projecteuler.problem009;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        String temp = "";

        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    temp = Integer.toString(a * b * c);
                }
            }
        }

        System.out.println(temp);
    }

}

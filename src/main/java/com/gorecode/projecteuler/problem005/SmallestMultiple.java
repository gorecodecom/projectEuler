package com.gorecode.projecteuler.problem005;

public class SmallestMultiple {

    public static boolean check(int number) {
        for (int i = 2; i <= 20; i++) {
            if (number % i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        int i = 1;
//        while (!check(i)) i++;
//        System.out.println(i);

        int number;
        int temp;


    }
}

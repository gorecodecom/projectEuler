package com.gorecode.projecteuler.problem004;

public class LargestPalindrome {
    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int reduce;

        while (number > 0) {
            reduce = number % 10;
            reverse = (reverse * 10) + reduce;
            number /= 10;
        }
        return reverse;
    }

    public static int palindrome(int a, int b) {
        int result;
        int largest = 0;
        for (int i = a; i > 99 ; i--) {
            for (int j = b; j > 99; j--) {
                result = i * j;
                if (isPalindrome(result)) {
                    largest = Math.max(largest, result);
                }
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(999, 999));
    }
}

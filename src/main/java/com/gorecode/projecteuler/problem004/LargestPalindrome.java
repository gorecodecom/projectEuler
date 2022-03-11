package com.gorecode.projecteuler.problem004;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

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
        return IntStream.range(100, a)
                .flatMap(i -> IntStream.range(100, b)
                        .map(x -> x * i))
                .filter(LargestPalindrome::isPalindrome)
                .max()
                .orElseThrow(() -> new NoSuchElementException("Außerhalb des möglichen Bereichs"));
    }

    public static void main(String[] args) {
        System.out.println(palindrome(999, 999));
    }
}

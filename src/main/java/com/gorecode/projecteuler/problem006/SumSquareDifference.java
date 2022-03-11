package com.gorecode.projecteuler.problem006;

import java.util.stream.IntStream;

public class SumSquareDifference {

    public static void main(String[] args) {
        int first;
        int second;
        int temp;

        first = IntStream.iterate(1, i -> i + 1)
                .limit(100)
                .map(i -> i * i)
                .sum();

        temp = IntStream.iterate(1, i -> i + 1)
                .limit(100)
                .sum();

        second = temp * temp;

        System.out.println(second - first);
    }

}

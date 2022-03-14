package com.gorecode.projecteuler.problem007Test;

import com.gorecode.projecteuler.problem007.TenThousandFirstPrime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TenThousandFirstPrimeTest {

    @Test
    public void checkPrimeTest() {
        int one = 5;
        int two = 13;
        int three = 17;
        int four = 21;

        assertAll(
                () -> assertTrue(TenThousandFirstPrime.checkPrime(one)),
                () -> assertTrue(TenThousandFirstPrime.checkPrime(two)),
                () -> assertTrue(TenThousandFirstPrime.checkPrime(three)),
                () -> assertFalse(TenThousandFirstPrime.checkPrime(four)));
    }

    @Test
    public void largestPrimeTest() {
        int one = 5;
        int two = 10;
        int three = 15;
        int four = 20;

        assertAll(
                () -> assertEquals(11, TenThousandFirstPrime.findLargePrime(one)),
                () -> assertEquals(29, TenThousandFirstPrime.findLargePrime(two)),
                () -> assertEquals(47, TenThousandFirstPrime.findLargePrime(three)),
                () -> assertEquals(71, TenThousandFirstPrime.findLargePrime(four)));
    }
}

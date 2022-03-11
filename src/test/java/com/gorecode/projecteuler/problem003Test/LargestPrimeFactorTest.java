package com.gorecode.projecteuler.problem003Test;

import com.gorecode.projecteuler.problem003.LargestPrimeFactor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LargestPrimeFactorTest {

    @Test
    public void checkPrimeFactor() {
        int one = 17;
        int two = 100;

        assertEquals(17, LargestPrimeFactor.largestPrimeFactor(one));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(two));
    }
}

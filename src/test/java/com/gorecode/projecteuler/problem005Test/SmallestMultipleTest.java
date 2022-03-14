package com.gorecode.projecteuler.problem005Test;

import com.gorecode.projecteuler.problem005.SmallestMultiple;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SmallestMultipleTest {

    @Test
    public void rangeCheck() {
        int one = 4;
        int two = 16;
        int three = 21;

        System.out.println(SmallestMultiple.check(one));
        System.out.println(SmallestMultiple.check(two));
        System.out.println(SmallestMultiple.check(three));

        assertFalse(SmallestMultiple.check(one));
        assertFalse(SmallestMultiple.check(two));
        assertFalse(SmallestMultiple.check(three));
    }
}

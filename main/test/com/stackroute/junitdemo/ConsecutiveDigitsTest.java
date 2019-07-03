package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveDigitsTest {
    ConsecutiveDigits consecutiveDigits;
    @Before
    public void setUp() {
        System.out.println("Before");
        consecutiveDigits = new ConsecutiveDigits();
    }

    @After
    public void tearDown() {
        consecutiveDigits = null;
        System.out.println("After");
    }

    @Test
    public void givenInputHasStringOfDigitsShouldPrintConsecutiveDigits() {
        boolean expected = false;
        boolean actual = consecutiveDigits.checkConsecutive("97,96,95,94,93");
        assertEquals(expected, actual);
    }
    @Test
    public void checkGivenInputIsConsecutiveOrNot() {
        boolean expected = true;
        boolean actual = consecutiveDigits.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }
    @Test
    public void checkGivenInputIsConsecutiveOrNotAndPrintFalse() {
    boolean expected = false;
    boolean actual = consecutiveDigits.checkConsecutive("1,2,3,4,5,6,6");
    assertEquals(expected, actual);
}


}
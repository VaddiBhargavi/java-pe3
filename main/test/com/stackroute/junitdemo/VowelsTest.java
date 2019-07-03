package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    Vowels vowels;
    @Before
    public void setUp() {
        System.out.println("Before");
        vowels = new Vowels();
    }

    @After
    public void tearDown() {
        vowels = null;
        System.out.println("After");
    }

    @Test
    public void givenInputIsStringShouldPrintWithoutVowels() {
      String[] result = Vowels.removeVowels(new String[] {"bhargavi", "vaddi"});
      assertArrayEquals(new String[] {"bhrgv","vdd"}, result);
    }
    @Test
    public void givenInputIsNullShouldPrintError() {
        String[] result = Vowels.removeVowels(new String[] {});
        assertArrayEquals(new String[] {"Error", null}, result);
    }
    @Test
    public void givenInputNullShouldPrintNull() {
        String[] result = Vowels.removeVowels(new String[] {"bhargavi"});
        assertArrayEquals(new String[] {"bhrgv", null}, result);
    }
}
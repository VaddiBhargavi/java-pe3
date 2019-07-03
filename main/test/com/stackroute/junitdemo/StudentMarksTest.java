package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public void setUp() {
        System.out.println("Before");
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() {
        studentMarks = null;
        System.out.println("After");
    }

    @Test
    public void calculateAverageAndPrintAverage() {
        double average = StudentMarks.average(new int[]{45, 78, 90, 25});
        assertEquals(59.5, average, 2);
    }

    @Test
    public void calculateMinimumAndPrintMinimum() {
        int min = StudentMarks.minimum(new int[]{45, 78, 90, 25});
        assertEquals(25, min, 2);
    }

    @Test
    public void calculateMaximumAndPrintMaximum() {
        int max = StudentMarks.maximum(new int[]{45, 78, 90, 25});
        assertEquals(90, max, 2);
    }
    @Test
    public void givenInputNullAndPrintError() {
        double average = StudentMarks.average(new int[]{1});
        assertEquals(0, average, 2);
    }
    @Test
    public void givenInputIsOnePrintZero() {
        int min = StudentMarks.minimum(new int[]{1});
        assertEquals(0, min, 2);
    }
    @Test
    public void givenInputNullPrintZero() {
        int max = StudentMarks.maximum(new int[]{2});
        assertEquals(0, max, 2);
    }
}

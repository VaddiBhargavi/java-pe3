package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.rmi.MarshalException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;
    @Before
    public void setUp() {
        System.out.println("Before");
        matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown() {
        matrixAddition = null;
        System.out.println("After");
    }

    @Test
    public void givenInputValuesShouldCalculateMatrixAddition() {
        int  sum[][] = MatrixAddition.addition(new int[][] {{1,2} ,{1,2},{1,2}}, new int[][] {{1,2} ,{1,2},{1,2}});
        assertArrayEquals(new int[][] {{2,4},{2,4},{2,4}},sum);
    }

    @Test
    public void givenNonEqualRowsAndColumnsShouldPrintError() {
        int  sum[][] = MatrixAddition.addition(new int[][] {{}}, new int[][] {{1,2} ,{1,2},{1,2}});
        assertArrayEquals(new int[][] {},sum);
    }
    }
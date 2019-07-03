package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekDateTest {
    WeekDate weekDate;
    @Before
    public void setUp() {
        weekDate = new WeekDate();
    }

    @After
    public void tearDown() {
        weekDate = null;
    }
    @Test
    public void startDate() {
        //Arrange
        assertEquals(true, weekDate.startDate());
        assertNotNull(weekDate.startDate());
    }
    @Test
    public void endDate() {
        //Arrange
        //Act
        assertEquals(true, weekDate.endDate());
        assertNotNull(weekDate.endDate());
    }
}
package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyExceptionTest {
    MyException myException;
    @Before
    public void setUp(){
        myException=new MyException("number should be positive");
    }
    @After
    public void tearDown(){
        myException=null;
    }
    @Test
    public void givenNumberIsZeroThrowException() throws Exception {
        String result=myException.exceptionraising(12);
        assertEquals("exception raised",result);
    }

}
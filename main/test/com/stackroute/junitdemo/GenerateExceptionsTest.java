package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {
        GenerateExceptions generateExceptions;
        @Before
        public void setUp(){
            generateExceptions=new GenerateExceptions();
        }
        @After
        public void tearDown(){
            generateExceptions=null;
        }
        @Test
        public void generateNagativeArrayException(){
            String result=generateExceptions.generateExceptions(-3);
            assertEquals("exception raised",result);
        }
        @Test
        public void generateArrayIndexOutOfBoundException(){
            String result=generateExceptions.generateIndexOutOfException(new int[]{1,2,3,4},7);
            assertEquals("exception raised",result);
        }
        @Test
        public void generateNullPointerException(){
            String result=generateExceptions.generateNullPointerException(null);
            assertEquals("exception raised",result);
        }
    }



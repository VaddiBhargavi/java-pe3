package com.stackroute.junitdemo;

public class GenerateExceptions {
    public static void main(String[] args) {
        try {
            throw new NegativeArraySizeException(); //Throws negative size exceptions
        } catch (NegativeArraySizeException e1) {
            System.out.println(e1.toString()); //Prints exception which converted to String
        }
        try {
            throw new IndexOutOfBoundsException(); //Throws IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e2) {
            System.out.println(e2.toString()); //Prints exception which converted to String
        }
        try {
            throw new NullPointerException();
        } catch (NullPointerException e3) { //Prints Null Pointer Exception
            System.out.println(e3.toString());
        }
    }
}


package com.stackroute.junitdemo;

public class MyException {
    //Created constructor with passing a message
        MyException(String message) {
            message = "number should be positive";
        }

        public String exceptionraising(int number) throws Exception {
            try {
                int sum = number / 0;
            } catch (Exception arthemeticException) {
                arthemeticException.printStackTrace();
            } finally {
                System.out.println("I will get printed");
            }
            return "exception raised";
        }
    }

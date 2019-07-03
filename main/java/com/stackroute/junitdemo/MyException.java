package com.stackroute.junitdemo;

public class MyException {
    //Created constructor with passing a message
   MyException(String message) {
        message = "this is bound to execute";
        System.out.println(message);
    }

    public static void main(String[] args) throws Exception {
        try {
             new Exception();//Throws an exception
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //Finally block will print whether error is thrown or not
            System.out.println("Anyway I will get printed");
        }
    }
}


package com.stackroute.junitdemo;

public class GenerateExceptions {
    public String generateExceptions(int number) {
        try {
            int[] number1 = new int[number];
// throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e1) {
            e1.printStackTrace();
            System.out.println(e1.toString());
        }
        return "exception raised";
    }
    public String generateIndexOutOfException(int[] number,int size) {
        try {
            int[] number1 = new int[size];

//throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e2) {
            System.out.println(e2.toString());
            e2.printStackTrace();
        }
        return "exception raised";
    }
    public String generateNullPointerException(String s){
        try {
//throw new NullPointerException();
            s.split(",");
            if(s==null){

            }

        } catch (NullPointerException e3) {
            System.out.println(e3.toString());
            e3.printStackTrace();
        }
        return "exception raised";
    }

}
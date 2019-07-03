package com.stackroute.junitdemo;

import java.util.Arrays;

public class ConsecutiveDigits {
    boolean result = false;
    public boolean checkConsecutive(String values) {
        String[] array = values.split(","); //Splitting string with commas
        for (int i = 0; i < array.length - 1; i++) {
            //Converting string to int
            //Comparing the digits whether they are consecutive or not
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            //If all the digits difference is 1 then prints true
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

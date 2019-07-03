package com.stackroute.junitdemo;

public class Vowels {

    public static String[] removeVowels(String[] input) {
        int i = 0;
        String[] result = new String[2];
        if (input.length <= 0) { //If input length is zero it results error
            result[i] = "Error";
        }
        //Replace the vowels and gives only consonants
        for (i = 0; i <= input.length - 1; i++) {
            String str = input[i];
            for (int b = 0; b < str.length(); b++) {
                if (str.charAt(b) == 'a' || str.charAt(b) == 'e' || str.charAt(b) == 'i' || str.charAt(b) == 'o' || str.charAt(b) == 'u') {
                    result[i] = str.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
                }
            }
        }
        return result;
    }
}


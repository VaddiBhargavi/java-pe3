package com.stackroute.junitdemo;

public class StudentMarks {
    static double average;
    static int sum = 0;
//Checks the average of all grades
    public static double average(int stuGrades[]) {
        int average;
        if (stuGrades.length - 1 < 1)
            return 0;
        else {
            for (int i = 0; i <= stuGrades.length - 1; i++) {
                sum = sum + stuGrades[i];
            }
            average = sum / stuGrades.length - 1;
            return average;
        }
    }
// Checks the maximum value of grades
    public static int maximum(int stuGrades[]) {
        int max = stuGrades[0];
        if (stuGrades.length - 1 < 1)
            return 0;
        else {
            for (int i = 0; i <= stuGrades.length - 1; i++) {
                if (stuGrades[i] > max)
                    max = stuGrades[i];
            }
            return max;
        }
    }
// Checks the minimum value of grades
    public static int minimum(int stuGrades[]) {
        int min = stuGrades[0];
        if (stuGrades.length - 1 < 1)
            return 0;
        else {
            for (int i = 0; i <= stuGrades.length - 1; i++) {
                if (stuGrades[i] < min)
                    min = stuGrades[i];
            }
            return min;
        }
    }
}


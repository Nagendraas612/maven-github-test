package com.example.maven_github_test;

public class GradeCalculator {

    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static double calculateAverage(int m1, int m2, int m3) {
        return calculateTotal(m1, m2, m3) / 3.0;
    }

    public static String calculateGrade(int total) {

        if (total >= 270) {
            return "A";
        }
        else if (total >= 240) {
            return "B";
        }
        else if (total >= 210) {
            return "C";
        }
        else if (total >= 120) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        int m1 = 75, m2 = 68, m3 = 82;

        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(m1, m2, m3);

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + calculateGrade(total));
    }
}
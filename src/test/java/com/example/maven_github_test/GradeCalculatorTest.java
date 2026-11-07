package com.example.maven_github_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testTotal() {
        assertEquals(225,
            GradeCalculator.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            GradeCalculator.calculateAverage(75, 68, 82), 0.001);
    }

    @Test
    void testAGrade() {
        assertEquals("A",
            GradeCalculator.calculateGrade(270));
    }

    @Test
    void testBGrade() {
        assertEquals("B",
            GradeCalculator.calculateGrade(255));
    }

    @Test
    void testCGrade() {
        assertEquals("C",
            GradeCalculator.calculateGrade(225));
    }

    @Test
    void testPass() {
        assertEquals("Pass",
            GradeCalculator.calculateGrade(150));
    }

    @Test
    void testFail() {
        assertEquals("Fail",
            GradeCalculator.calculateGrade(90));
    }
}

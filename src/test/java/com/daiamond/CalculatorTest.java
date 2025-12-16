package com.daiamond;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("should add two numbers correctly")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    @DisplayName("should subtract two numbers correctly")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-4, calculator.subtract(-2, 2));
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    @DisplayName("should multiply two numbers correctly")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(-2, 3));
        assertEquals(6, calculator.multiply(-2, -3));
    }

    @Test
    @DisplayName("should divide two numbers correctly")
    void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2));
        assertEquals(-1.5, calculator.divide(-3, 2));
    }

    @Test
    @DisplayName("should throw exception when dividing by zero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}

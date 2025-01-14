package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {

        assertEquals(8, calculator.add(3, 5));
        assertNotEquals(8, calculator.add(3, 4));

    }

    @Test
    void subtract() {

        assertEquals(5, calculator.subtract(10, 5));
        assertNotEquals(10, calculator.subtract(3, 4));

    }

    @Test
    void multiply() {

        assertEquals(25, calculator.multiply(5, 5));
        assertNotEquals(10, calculator.multiply(3, 4));

    }

    @Test
    void divide() {
        try {
            assertEquals(5, calculator.divide(25, 5));
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }

        try {
            assertNotEquals(3, calculator.divide(4, 1));
        }catch (DivideByZeroException e){
            throw new RuntimeException(e);
        }
        assertThrows(DivideByZeroException.class, () -> {calculator.divide(10,0 );});

    }
}
package com.revature.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void addShouldAdd() {
        // arrange
        Calculator testCalculator = new Calculator();
        int x = 5;
        int y = 2;
        int expected = 7;
        // act
        int actual = testCalculator.add(x, y);
        // assert
        assertEquals(expected, actual);
    }

}

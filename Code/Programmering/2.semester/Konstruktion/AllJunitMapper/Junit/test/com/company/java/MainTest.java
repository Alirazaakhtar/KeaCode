package com.company.java;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //Arrange
    Main main = new Main();

    @Test
    public void testThatJUnitWorks() {

        //Act
        int expected = 2;
        int actual = main.sum(1, 1);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectInputAndCorrectResult() {
        //Act
        int expected = 45;
        int actual = main.sum(19, 26);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testForWrongInputThrowException() {
        assertThrows(InputMismatchException.class, () -> {
            main.sum(1002, 2);
        });
    }

}

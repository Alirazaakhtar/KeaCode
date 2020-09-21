package com.example.mywebapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MywebappApplicationTest {

    @Test
    void getNum() {
        //Arrange
        MywebappApplication mywebappApplication = new MywebappApplication();
        //Act
        int expected = 10;
        int actual = mywebappApplication.getNum(5,5);
        //Assert
        assertEquals(expected,actual);
    }
}
package com.example.sumtest.controllers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumControllerTest {

    @Test
    void getSum() {
        float n1 = 562.5657f;
        float n2 = 8.9789f;
        float actual = SumController.getSum(n1, n2);
        float expected = 571.5446f;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void getSum_INTEGER() {
        int n1 = 7;
        int n2 = 52;
        float actual = SumController.getSum(n1, n2);
        float expected = 59;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void getSum_DOUBLE() {
        double n1 = 562.58;
        double n2 = 8.78;
        float actual = SumController.getSum((float)n1, (float)n2);
        float expected = 571.36f;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void getSum_BYTE() {
        byte n1 = 15;
        byte n2 = 100;
        float actual = SumController.getSum(n1, n2);
        float expected = 115;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void getSum_SHORT() {
        short n1 = 250;
        short n2 = 18;
        float actual = SumController.getSum(n1, n2);
        float expected = 268;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void getSum_LONG() {
        long n1 = 25899;
        long n2 = 25784;
        float actual = SumController.getSum(n1, n2);
        float expected = 51683;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void getSum_CHAR() {
        char n1 = 'A';
        char n2 = 'f';
        float actual = SumController.getSum(n1, n2);
        float expected = 167;

        assertEquals(expected, actual, 0.0001);
    }

}
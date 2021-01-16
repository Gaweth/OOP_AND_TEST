package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    public  void setup(){
        calculator = new StringCalculator();
    }

    //if "" passed, return 0
    @Test
    public void testEmptyStringPassed(){
        String value = "";

        int result = calculator.add(value);

        //unit assertion
        assertEquals(0, result,"expected 0 when passing empty string");
        //ASSERTJ assertions
        assertThat(result).as("expected 0 when passing emptystring").isEqualTo(0)
        .isNotEqualTo(1).isGreaterThan(-3).isLessThan(2);


    }

    //if one number passed, return its 3
    @Test
    public void testOneNumberPassed()
    {
        int expected = 3;
        String check = "3";

        int result = calculator.add(check);

        assertThat(result).as("when passing 3, expect 3 on output").isEqualTo(3);
    }

    //if more  number passed with comma,"2,3" add them to get 5
    @Test
    public void testTwoNumbersPassed()
    {
        int excpected = 5;
        String check = "2,3";

        int result = calculator.add(check);

        assertThat(result).as("expected sum of 2 and 3").isEqualTo(excpected);

    }
}
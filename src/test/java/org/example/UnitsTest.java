package org.example;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UnitsTest {

    Units units;

    @BeforeAll //uzywamu rzadziej raczej testy integracyjne
    public static void  commonSetup(){
        System.out.println("commonSetup called once per class");
    }


    @BeforeEach //uzywamu czesciej
    public void setup()
    {
        System.out.println("set new obj for every test");
        units = new Units();
    }

    @Test
    public void testRemover(){
        //given
        String expected ="ABCDE";
        String toCheck ="AABBCCDDEE";

        //when
        String result = units.removePairs(toCheck);

        //then
       // assertEquals(expected, result);
        assertEquals(expected, result, "dggs");
    }
    @Test
    public void testPairRemover()
    {

    }

    @Test
    public void testEveryNthChar()
    {
        char[] expected = new char[]{'a','b','c'};
        char[] toCheck = new char[]{'a', 'b','b','c'};

        char[] result = units.everyNthChar(toCheck,2);

       //assertArrayEquals(expected, result);
    }

    @AfterEach //uzywamu czesciej
    public void teardown(){
        System.out.println("After each test");
        units.toString();

    }

    @AfterAll //uzywamu rzadziej, raczej testy integracyjne
    public static void afterAllTest(){
        System.out.println("AfterAll runonce after all test");
    }

}
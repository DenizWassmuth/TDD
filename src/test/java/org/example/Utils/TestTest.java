package org.example.Utils;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    // Red -> Green -> Refactor (Prinzip eines TDD)
    // Tests sollten immer so geschrieben werden, dass sie grü werden beim Testen, also die Bedingung muss entsprechend angepasst werden, z.B.: assertEquals oder assertNotEqual

    @Test
    void fizzBuzz_shouldReturnBuzz_whenGivenNumberIs5() {

        //GIVEN
        int number = 5;
        String expected = "Buzz";
        //WHEN
        String actual = org.example.Utils.Test.fizzBuzz(number);
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void getFirstCharacter_shouldReturnH_whenGivenStringIsHello()
    {
        String given = "Hallo";

        Character expected = 'H';

        Character actual = org.example.Utils.Test.getFirstCharacter(given);

        assertEquals(expected, actual);
    }

    //
    @Test
    void getFirstCharacter_shouldReturnM_whenGivenStringIsMarmelade()
    {
        String given = "Hallo";

        Character expected = 'M';

        Character actual = org.example.Utils.Test.getFirstCharacter(given);

        assertNotEquals(expected, actual);
    }

    @Test
    void countVowels_shouldReturn2_whenGivenStringIsHallo()
    {
        String given = "HAllo";
        int expected = 2;

        int actual = org.example.Utils.Test.countVowels(given);

        assertEquals(expected, actual);
    }

    @Test
    void countVowels_shouldReturn1_whenGivenStringIsHallo()
    {
        String given = "Hallo";
        int expected = 1;

        int actual = org.example.Utils.Test.countVowels(given);

        assertNotEquals(expected, actual);
    }

    @Test
    void mergeArrays_shouldReturnAnArrayOf6234_whenGivenArraysAre62And34()
    {
        int[] given1 = {6,2};
        int[] given2 = {3,4};

        int[] expected = new int[] {6,2,3,4};

        int[] actual = org.example.Utils.Test.mergeArrays(given1, given2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeArrays_shouldReturnAnArrayOf7234_whenGivenArraysAre72And34()
    {
        int[] given1 = {7,2};
        int[] given2 = {3,4};

        int[] expected = new int[] {6,2,3,4};

        int[] actual = org.example.Utils.Test.mergeArrays(given1, given2);

        assertArrayEquals(expected, actual);
    }

    //    @ParameterizedTest
    //    @CsvSource()
    //    @CsvFileSource(resources = ".../...") / Pfad angeben
    //    void mergeArrays_shouldReturnAnArrayOf1234_whenGivenArraysAre12And34()
}
package org.example.Utils;

import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    // Red -> Green -> Refactor (Prinzip eines TDD)
    @Test
    void fizzBuzz_shouldReturnBuzz_whenGivenNumberIs5() {

        //GIVEN
        String expected = "Buzz";
        int number = 5;
        //WHEN
        String actual = org.example.Utils.Test.fizzBuzz(number);
        //THEN
        assertEquals(expected, actual);
    }
}
package org.example.Utils;

import org.example.Main;
import org.junit.jupiter.api.Test;

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
        String given = "Hallo";
        int expected = 2;

        int actual = org.example.Utils.Test.countVowels(given);

        assertEquals(expected, actual);
    }
}
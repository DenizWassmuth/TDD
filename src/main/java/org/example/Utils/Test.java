package org.example.Utils;

/**
 *
 * Test – kurze Beschreibung
 * Author: Deniz Wassmuth
 * Date: 04.12.2025
 * <p>
 * KEEP IN MIND:
 * - check and/or change user and email through GitBash
 * - add /target, *.iml and .idea to gitignore
 * - exclude previously added files from git changes through GitBash (git rm -r) and readd the files needed (git add .)
 */

public class Test
{
    public static String fizzBuzz(int number)
    {
        if (number % 3 == 0 && number % 5 == 0)
        {
            return "FizzBuzz";

        } else if (number % 3 == 0) {
            return "Fizz";

        }
        else if (number % 5 == 0)
        {
            return "Buzz";
        }

        return "" + number;
    }
}







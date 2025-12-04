package org.example.Utils;

/**
 *
 * Test – TDD
 * Author: Deniz Wassmuth
 * Date: 04.12.2025
 * <p>
 * KEEP IN MIND:
 * - check and/or change user and email through GitBash
 * - add /target, *.iml and .idea to gitignore
 * - exclude previously added files from git changes through GitBash (git rm -r) and readd the files needed (git add .)
 */

public class Test {
    // FizzBuzz: druch 3 und 5 teilbar -> FizzBuzz, durch 3 teilbar -> Fizz, durch 5 teilbar -> Buzz, else -> Zahl
    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return "" + number;
    }


    // Level 1 - 3
    public static Character getFirstCharacter(String inputText) {
        if (inputText == null) {
            return null;
        }

        return inputText.charAt(0);
    }


    //Level 2 - 3
    public static int countVowels(String text) {
        Character[] Vowels = {'a', 'e', 'i', 'o', 'u'};

        int numOfVowels = 0;

        for (int i = 0; i < text.toCharArray().length; i++) {
            Character c = text.charAt(i);
            c = Character.toLowerCase(c);
            for (int j = 0; j < Vowels.length; j++) {
                if (c == Vowels[j]) {
                    numOfVowels += 1;
                }
            }
        }
        return numOfVowels;
    }


    // Level 3 - 3
    public static int[] mergeArrays(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int nextIndex = 0;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            nextIndex = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            c[nextIndex] = b[i];
            nextIndex += 1;
        }
        //c =  new int[0];

        return c;
    }
}







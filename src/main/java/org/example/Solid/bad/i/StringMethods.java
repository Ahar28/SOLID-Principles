package org.example.Solid.bad.i;

import java.util.Map;

public interface StringMethods {
    int CharacterCount(String text);
    String stringReversal(String text);
    boolean isPalindrome(String text);
    int wordCount(String text);
    String capitalizeWords(String text);
    boolean isAnagram(String text1,String text2);
    Map<Character,Integer> charFreq(String text);
}